<%--
  Created by IntelliJ IDEA.
  User: wen
  Date: 2022/8/8
  Time: 11:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Layui</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/layui/2.7.6/css/layui.min.css"    media="all">
</head>
<body>
<!--一个没什么用的二维码-->
<img src="https://api.nbhao.org/v1/qrcode/make?text=https://blog.csdn.net/m0_71674778?spm=1000.2115.3001.5343&el=H&fc=black&bc=white&s=200">

<!--商品数据的表格-->
<div class="layui-container" >
    <table id="goodsTable" lay-filter="goodsTable"></table>
</div>


<!--form表单，用于添加和修改商品-->
<form class="layui-form" action="" id="goodsForm" lay-filter="goodsForm" style="display: none;margin-right: 20px">
    <!--goodsId隐藏域-->
    <input type="hidden" name="goodsId" id="goodsId" />
    <!--提交地址隐藏于，区分添加和修改操作-->
    <input type="hidden" name="actionUrl" id="actionUrl" />

    <div class="layui-form-item">
        <label class="layui-form-label">商品名</label>
        <div class="layui-input-block">
            <input type="text" name="goodsName"  lay-verify="required" placeholder="请输入商品名" autocomplete="off" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">价格</label>
        <div class="layui-input-block">
            <input type="text" name="price"  lay-verify="required" placeholder="请输入价格" autocomplete="off" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">生产日期</label>
        <div class="layui-input-block">
            <input type="text" name="produceDate" id="produceDate" lay-verify="required" placeholder="请输入生产日期" autocomplete="off" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">产地</label>
        <div class="layui-input-block">
            <select name="address" id="address" lay-filter="address">
                <option value="">请选择</option>
            </select>
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">商品分类</label>
        <div class="layui-input-block">
            <select name="categoryId" id="categoryId" lay-filter="categoryId">
                <option value="">请选择</option>
            </select>
        </div>
    </div>
    <div class="layui-form-item">
        <div class="layui-input-block">
            <button type="button" class="layui-btn" lay-submit="" lay-filter="goodsBtnSubmit">立即提交</button>
            <button type="reset" class="layui-btn" >重置</button>
        </div>
    </div>
</form>


<!--表头工具条-->
<script type="text/html" id="goodsTableToolbar">
    <div>
        <button class="layui-btn layui-btn-sm layui-btn-normal" lay-event="goodsAdd">添加商品</button>
        <button class="layui-btn layui-btn-sm layui-btn-danger" lay-event="goodsDeleteBatch">批量删除</button>
    </div>
</script>

<!--表内行工具条-->
<script type="text/html" id="goodsTableRowToolbar">
    <div class="layui-btn-container">
        <button class="layui-btn layui-btn-sm layui-btn-normal" lay-event="goodsEdit">编辑</button>
        <button class="layui-btn layui-btn-sm layui-btn-danger" lay-event="goodsDelete">删除</button>
    </div>
</script>

<!--引入layui-->
<script src="https://cdnjs.cloudflare.com/ajax/libs/layui/2.7.6/layui.min.js" charset="utf-8"></script>

<script>
    layui.use(['table','layer','form','laydate'], function(){
        var table = layui.table
            ,form = layui.form
            ,layer = layui.layer
            ,$ = layui.$
            ,laydate = layui.laydate;

        /*渲染form的日期框*/
        laydate.render({
            elem: "#produceDate"
        })

        //请求数据，渲染表格
        table.render({
            elem: '#goodsTable'//要渲染的表格的id
            ,url: '${pageContext.request.contextPath}/GoodsServlet/allGoods'//请求地址
            ,cellMinWidth: 80 //全局定义常规单元格的最小宽度，layui 2.2.1 新增
            ,page:true  //是否开启分页
            ,toolbar:"#goodsTableToolbar"//表头工具条
            ,width:800  //表格宽度
            ,limit:10   //初始每页的数据数
            ,limits:[5,10,15,20,25] //选择每页数据数的下拉框的取值
            ,cols: [[
                {title:'多选',type:'checkbox',width: 60}
                ,{field:'goodsId', width:80, title: '商品编号', sort: true}
                ,{field:'goodsName', width:80, title: '商品名'}
                ,{field:'price', width:80, title: '价格', sort: true,}
                ,{field:'produceDate', width:120, title: '生产日期',sort: true,templet:function (d) {
                        return layui.util.toDateString(d.produceDate,"yyyy-MM-dd")
                    }}
                ,{field:'address', title: '产地', width: 80} //minWidth：局部定义当前单元格的最小宽度，layui 2.2.1 新增
                ,{field:'categoryName', title: '分类', width:80}
                ,{title: '操作',toolbar:"#goodsTableRowToolbar",fixed:"right"}
            ]]
        });
        /*行工具条的点击事件*/
        table.on("tool(goodsTable)",function (obj){
            console.log(obj);
            switch (obj.event){
                case "goodsEdit":
                    $("#goodsForm")[0].reset();
                    $("#actionUrl").val("${pageContext.request.contextPath}/GoodsServlet/update");
                    form.val("goodsForm",obj.data);
                    showGoodsForm();
                    break;
                case "goodsDelete":
                    layer.confirm("确定要删除么?",function (index){
                        deleteGoods(obj.data.goodsId);
                        layer.close(index);
                    })
                    break;
            }
        })
        /*form表单提交*/
        form.on("submit(goodsBtnSubmit)",function (obj) {
            $.ajax({
                type:"get",
                url:$("#actionUrl").val(),
                data:obj.field,
                success:function (res) {
                    if(res.code==0){
                        layer.msg("成功");
                        layer.close(goodsFormIndex);
                        $("#goodsForm")[0].reset();
                        //重新加载表格
                        table.reload("goodsTable",{
                            page:{curr:1}
                        })
                    }else {
                        layer.msg("失败");
                    }
                },
                dataType:"json"
            })
        })
        /*加载商品产地的下拉框*/
        $.get(
            "${pageContext.request.contextPath}/GoodsServlet/addressList",
            function (res){
                if(res.code==0){
                    for (let i = 0; i < res.data.length; i++) {
                        var address = res.data[i].address;
                        $("#address").append("<option value='"+address+"'>"+address+"</option>")
                    }
                }
            },
            "json"
        )
        /*加载商品分类的下拉框*/
        $.get(
            "${pageContext.request.contextPath}/CategoryServlet/list",
            function (res){
                if(res.code==0){
                    for (let i = 0; i < res.data.length; i++) {
                        var cate = res.data[i];
                        $("#categoryId").append("<option value='"+cate.categoryId+"'>"+cate.categoryName+"</option>")
                    }
                }
            },
            "json"
        )
        /*给表头工具条绑定事件*/
        table.on("toolbar(goodsTable)",function (obj){
            switch (obj.event) {
                case "goodsAdd":
                    //重置表单内容
                    $("#goodsForm")[0].reset();
                    //设置表单的提交地址
                    $("#actionUrl").val("${pageContext.request.contextPath}/GoodsServlet/add");
                    showGoodsForm();
                    break;
                case "goodsDeleteBatch":
                    var checkStatus = table.checkStatus('goodsTable');
                    var ids = [];
                    for (let i = 0; i < checkStatus.data.length; i++) {
                        ids.push(checkStatus.data[i].goodsId);
                    }
                    layer.confirm("确定要删除么?",function (index){
                        deleteGoods(ids.join(","));
                        layer.close(index);
                    })
                    console.log(checkStatus);
                    break;
            }
        });
        var goodsFormIndex;
        /*显示弹出层*/
        function showGoodsForm(){
            goodsFormIndex=layer.open({
                type: 1,
                skin: 'layui-layer-rim', //加上边框
                area: ['600px', '400px'], //宽高
                content: $("#goodsForm")
            });
        }
        /*删除商品的请求*/
        function deleteGoods(goodsIds){
            $.get(
                "${pageContext.request.contextPath}/GoodsServlet/delete",
                {"ids":goodsIds},
                function (res){
                    if(res.code==0){
                        layer.alert("删除成功");
                        table.reload("goodsTable",{
                            page:{curr:1}
                        })
                    }else {
                        layer.alert("删除失败");
                    }
                },
                "json"
            )
        }
    });
</script>

</body>
</html>

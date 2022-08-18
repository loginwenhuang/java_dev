<%--
  Created by IntelliJ IDEA.
  User: wen
  Date: 2022/8/13
  Time: 16:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>goodsList</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/layui/2.7.6/css/layui.min.css"    media="all">
</head>
<body>
    <table id="goodsTab" lay-filter="goodsTab"></table>

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


    <script type="text/html" id="goodsToolBar">
        <button type="button" class="layui-btn layui-btn-sm layui-btn-normal" lay-event="addGoods">添加</button>
        <button type="button" class="layui-btn layui-btn-sm layui-btn-danger" lay-event="deleteGoodsList">批量删除</button>
    </script>
    <script type="text/html" id="goodsRowToolBar">
        <button type="button" class="layui-btn layui-btn-sm layui-btn-normal" lay-event="updateGoods">修改</button>
        <button type="button" class="layui-btn layui-btn-sm layui-btn-danger" lay-event="deleteGoods">删除</button>
    </script>

    <script src="https://cdnjs.cloudflare.com/ajax/libs/layui/2.7.6/layui.min.js" charset="utf-8"></script>
    <script>
        layui.use(['table','layer','form','laydate'], function(){
            var table = layui.table
                ,form = layui.form
                ,layer = layui.layer
                ,$ = layui.$
                ,laydate = layui.laydate;

            laydate.render({
                elem: "#produceDate"
            })

            //请求数据，渲染表格
            table.render({
                elem: '#goodsTab'//要渲染的表格的id
                ,url: '${pageContext.request.contextPath}/GoodsServlet/selectByPage'//请求地址
                ,cellMinWidth: 80 //全局定义常规单元格的最小宽度，layui 2.2.1 新增
                ,page:true  //是否开启分页
                ,width:600  //表格宽度
                ,limit:10   //初始每页的数据数
                ,limits:[5,10,15,20] //选择每页数据数的下拉框的取值
                ,toolbar:'#goodsToolBar'
                ,cols: [[
                    {title:'多选',type:'checkbox',width: 60}
                    ,{field:'goodsId', width:80, title: '商品编号', sort: true}
                    ,{field:'goodsName', width:80, title: '商品名'}
                    ,{field:'price', width:80, title: '价格', sort: true,}
                    ,{field:'produceDate', width:120, title: '生产日期',sort: true,templet:function (d) {
                            return layui.util.toDateString(d.produce_date,"yyyy-MM-dd")
                        }}
                    ,{field:'address', title: '产地', width: 80} //minWidth：局部定义当前单元格的最小宽度，layui 2.2.1 新增
                    ,{field:'categoryName', title: '分类', width:80,templet:function (d) {
                            console.log(d.category)
                            return d.category.categoryName
                        }}
                    ,{title: '操作', toolbar:'#goodsRowToolBar',fixed:"right"}
                ]]
            });

            table.on("tool(goodsTab)",function (obj) {
                console.log(obj);
                switch (obj.event) {
                    case 'updateGoods':
                        break;
                    case "deleteGoods":
                        break;
                }
            })
            table.on("toolbar(goodsTab)",function (obj) {
                switch (obj.event){
                    case "addGoods":
                        $("#goodsForm")[0].reset();
                        $("#actionUrl").val("${pageContext.request.contextPath}/GoodsServlet/insert");
                        showForm();
                        break;
                }
            })
            var goodsFormIndex;
            function showForm(){
                goodsFormIndex = layer.open({
                    type: 1,
                    skin:'layui-layer-rim',
                    area:['600px','400px'],
                    content:$("#goodsForm")
                })
            }

            form.on("submit(goodsBtnSubmit)",function (){
                $.ajax({
                    type:'get',
                    url:$("#actionUrl").val,
                    success:function (res){
                        if(res.code==0){
                            layer.msg("成功!")
                            layer.close(goodsFormIndex)
                            $("#goodsForm")[0].reset()

                            table.reload("goodsTab",{
                                page:{curr:1}
                            })
                        }else {
                            layer.msg("失败!")
                        }
                    },
                    dataType:"json"
                })
            })
        })
    </script>
</body>
</html>

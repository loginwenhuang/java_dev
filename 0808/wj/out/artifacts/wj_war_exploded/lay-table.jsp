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
    <link rel="stylesheet" href="${pageContext.request.contextPath}/Layui/layui-v2.6.8/layui/css/layui.css"    media="all">
</head>
<body>

<table class="layui-hide" id="test"></table>


<script src="${pageContext.request.contextPath}/Layui/layui-v2.6.8/layui/layui.js" charset="utf-8"></script>

<script>
    layui.use('table', function(){
        var table = layui.table;

        table.render({
            elem: '#test'
            ,url: '${pageContext.request.contextPath}/GoodsServlet/allGoods'
            ,cellMinWidth: 80 //全局定义常规单元格的最小宽度，layui 2.2.1 新增
            ,cols: [[
                {field:'goodsId', width:80, title: '商品编号', sort: true}
                ,{field:'goodsName', width:80, title: '商品名'}
                ,{field:'price', width:80, title: '价格', sort: true,}
                ,{field:'produceDate', width:80, title: '生产日期',templet:function (d) {
                        return layui.util.toDateString(d.produceDate,"yyyy-MM-dd")
                    }}
                ,{field:'address', title: '郑州', width: '30%', minWidth: 100} //minWidth：局部定义当前单元格的最小宽度，layui 2.2.1 新增
                ,{field:'categoryName', title: '分类', sort: true}
            ]]
        });
    });
</script>

</body>
</html>

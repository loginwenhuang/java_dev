<%--
  Created by IntelliJ IDEA.
  User: wen
  Date: 2022/8/9
  Time: 16:10
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
<!--商品数据的表格-->
<table id="goodsTable" lay-filter="goodsTable"></table>

<!--表头工具条-->
<script type="text/html" id="goodsTableToolbar">
    <div>
        <button type="button" class="layui-btn layui-btn-sm layui-btn-normal" lay-event="goodsAdd">添加</button>
        <button type="button" class="layui-btn layui-btn-sm layui-btn-danger" lay-event="goodsDelBatch">批量删除</button>
    </div>
</script>

<script type="text/html" id="goodsTableRowToolBar">
    <div class="layui-btn-container">
        <button type="button" class="layui-btn layui-btn-sm layui-btn-normal" lay-event="goodsEdit">修改</button>
        <button type="button" class="layui-btn layui-btn-sm layui-btn-danger" lay-event="goodsDelete">删除</button>
    </div>
</script>

<!--引入layui-->
<script type="text/javascript" src="${pageContext.request.contextPath}/Layui/layui-v2.6.8/layui/layui.js" charset="utf-8"></script>

<script type="text/javascript">
    layui.use(['table','layer'],function () {
        var table = layui.table
            ,layer = layui.layer;

        table.render({
            elem:"#goodsTable"
            ,url:"${pageContext.request.contextPath}/GoodsServlet/allGoods"
            ,page:true
            ,limit:10
            ,limits:[5,10,15,20]
            ,cols:[[
                {title:'多选'}
            ]]
        })
    })
</script>

</body>
</html>

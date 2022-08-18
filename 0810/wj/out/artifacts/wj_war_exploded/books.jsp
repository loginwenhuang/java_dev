<%--
  Created by IntelliJ IDEA.
  User: wen
  Date: 2022/8/10
  Time: 9:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/layui/2.7.6/css/layui.min.css"    media="all">
</head>
<body>
<tabel id="bookList" lay-filter="bookList"></tabel>

<script src="https://cdnjs.cloudflare.com/ajax/libs/layui/2.7.6/layui.min.js" charset="utf-8"></script>
<script type="text/javascript">
    layui.use(['table'],function () {
        var table  = layui.table;

        table.render({
            elem: '#bookList'//要渲染的表格的id
            ,url: '${pageContext.request.contextPath}/BookServlet'//请求地址
            ,cellMinWidth: 80 //全局定义常规单元格的最小宽度，layui 2.2.1 新增
            // 是否开启分页
            ,width:800  //表格宽度
            ,cols: [[
                {field:'id', width:80, title: '图书编号', sort: true}
                ,{field:'name', width:80, title: '书名'}
                ,{field:'author', width:80, title: '作者'}
                ,{field:'press', width:120, title: '出版社',sort: true}
                ,{field:'proDate', title: '生产日期', width: 80,templet:function (d) {
            return layui.util.toDateString(d.proDate,"yyyy-MM-dd")
        }}
                ,{field:'s_name', title: '分类', width:80}
            ]]
        });
    })

</script>
</body>
</html>

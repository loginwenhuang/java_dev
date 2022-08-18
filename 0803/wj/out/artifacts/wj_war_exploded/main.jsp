<%--
  Created by IntelliJ IDEA.
  User: wen
  Date: 2022/8/3
  Time: 9:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<html>
<head>
    <title>Title</title>
    <link rel="icon" href="https://pic.stackoverflow.wiki/uploadImages/123/161/202/123/2022/08/03/17/11/ef9cd82a-0ff8-4b87-b0dd-d29effcab4d5.ico">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/frame/layui/css/layui.css">
</head>
<body>
<form method="get" action="${pageContext.request.contextPath}/BookServlet/selectSome">
    <table align="center" class="layui-table">
        <tr>
            <td colspan="5">
                书名:
                <input class="layui-input" type="text" name="condition_name" value="${condition_name}"/>
                作者:
                <input class="layui-input" type="text" name="condition_author" value="${condition_author}"/>
                <button type="submit" class="layui-btn layui-btn-normal">搜索</button>
            </td>
        </tr>
        <tr>
            <td>编号</td>
            <td>书名</td>
            <td>作者</td>
            <td>价格</td>
            <td>生产日期</td>
        </tr>
        <c:forEach items="${books}" var="book">
        <tr>
            <td>${book.id}</td>
            <td>${book.name}</td>
            <td>${book.author}</td>
            <td>${book.price}</td>
            <td>${book.prcDate}</td>
        </tr>
        </c:forEach>
        <c:forEach items="${books_name}" var="book">
            <tr>
                <td>${book.id}</td>
                <td>${book.name}</td>
                <td>${book.author}</td>
                <td>${book.price}</td>
                <td>${book.prcDate}</td>
            </tr>
        </c:forEach><c:forEach items="${books_author}" var="book">
            <tr>
                <td>${book.id}</td>
                <td>${book.name}</td>
                <td>${book.author}</td>
                <td>${book.price}</td>
                <td>${book.prcDate}</td>
            </tr>
        </c:forEach>
    </table>
</form>
</body>
</html>
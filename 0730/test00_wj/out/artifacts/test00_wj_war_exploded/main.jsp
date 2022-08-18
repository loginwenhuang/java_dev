<%--
  Created by IntelliJ IDEA.
  User: wen
  Date: 2022/7/30
  Time: 17:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@ include file="index.jsp"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="">
    <thead>
    <tr>
        <td>编号</td>
        <td>品名</td>
        <td>价格 </td>
        <td>生产日期</td>
        <td>生产地址</td>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${goodsList}" var="goods">
        <tr>
            <td>${goods.goodsId}</td>
            <td>${goods.goodsName}</td>
            <td>${goods.price}</td>
            <td>${goods.proDate}</td>
            <td>${goods.proAdd}</td>
        </tr>
    </c:forEach>
    <hr/>
    <%
        out.println(request.getAttribute("goodsList"));
        out.flush();
        out.close();
    %>
    </tbody>
</table>

</body>
</html>

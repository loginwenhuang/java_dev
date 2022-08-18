<%--
  Created by IntelliJ IDEA.
  User: henry
  Date: 2022/7/30
  Time: 10:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>页面req1</h1>
    <%
    request.setAttribute("bbb",200);
    request.getRequestDispatcher("/req3.jsp").forward(request,response);
    %>
    bbb:<%=request.getAttribute("bbb")%>
</body>
</html>

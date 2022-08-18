<%--
  Created by IntelliJ IDEA.
  User: henry
  Date: 2022/7/30
  Time: 10:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>这是page1页面</h1>
    <%
        pageContext.setAttribute("aaa",100);
        request.getRequestDispatcher("/page2.jsp").forward(request,response);
    %>
    aaa:<%=pageContext.getAttribute("aaa")%>
</body>
</html>

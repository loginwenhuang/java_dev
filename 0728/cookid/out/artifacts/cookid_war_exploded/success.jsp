<%--
  Created by IntelliJ IDEA.
  User: wen
  Date: 2022/7/28
  Time: 15:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    登录成功!欢迎用户<%=request.getAttribute("userName")%>!
    <a href="index.jsp">返回首页</a>
</body>
</html>

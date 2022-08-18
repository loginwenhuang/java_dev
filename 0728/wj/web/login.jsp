<%--
  Created by IntelliJ IDEA.
  User: wen
  Date: 2022/7/28
  Time: 9:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="<%=request.getContextPath()%>/LoginServlet" method="get">
    账号:
    <input type="text" name="userName" value=""/><br/>
    密码:
    <input type="password" name="password" value="" /><br/>
    <input type="submit" value="登录" />
</form>
</body>
</html>

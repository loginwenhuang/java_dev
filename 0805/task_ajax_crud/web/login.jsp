<%--
  Created by IntelliJ IDEA.
  User: wen
  Date: 2022/8/5
  Time: 16:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/LoginServlet" method="get">
    用户名:<input type="text" name="userName" /><br/>
    密  码:<input type="password" name="password" /><br/>
    <input type="submit" value="登录" />
</form>
</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: wen
  Date: 2022/8/5
  Time: 9:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/Servlet/LoginServlet">
        账号:
        <input type="text" name="userName"/>
        密码:
        <input type="password" name="password"/>
        <input type="submit" value="登录"/>
    </form>
</body>
</html>

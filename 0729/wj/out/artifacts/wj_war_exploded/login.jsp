<%--
  Created by IntelliJ IDEA.
  User: wen
  Date: 2022/7/29
  Time: 9:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="<%=request.getContextPath()%>/LoginServlet" method="get">
        账号:<br/>
        <input type="text" name="userName" /><br/>
        密码:<br/>
        <input type="password" name="password" /><br/>
        <input type="submit" value="登录"/>
    </form>
</body>
</html>

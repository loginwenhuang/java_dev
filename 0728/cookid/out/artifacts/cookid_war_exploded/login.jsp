<%--
  Created by IntelliJ IDEA.
  User: wen
  Date: 2022/7/28
  Time: 15:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录页面</title>
</head>
<body>
<form action="<%=request.getContextPath()%>/LoginServlet" method="get">
    账号:<br/>
    <input type="text" name="userName" /><br/>
    密码:<br/>
    <input type="password" name="password" /><br/>
    <input type="checkbox" name="check" value="1"/><br/>
    <input type="submit" value="登录" />
</form>
<div><%=request.getAttribute("error")==null?"":request.getAttribute("error")%></div>
</body>
</html>

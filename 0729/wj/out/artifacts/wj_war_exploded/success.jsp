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
    登录成功!<br/>
    <a href="<%=request.getContextPath()%>/index.jsp">退出</a><br/>
    <a href="<%=request.getContextPath()%>/SignOutServlet">安全退出</a>
</body>
</html>

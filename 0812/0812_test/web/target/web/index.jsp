<%@ page import="service.impl.StudentServiceImpl" %><%--
  Created by IntelliJ IDEA.
  User: wen
  Date: 2022/8/12
  Time: 14:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        application.setAttribute("stu",new StudentServiceImpl().listAll());
    %>
    <%
        out.print(application.getAttribute("stu"));
    %>

</body>
</html>

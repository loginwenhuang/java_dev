<%--
  Created by IntelliJ IDEA.
  User: henry
  Date: 2022/7/30
  Time: 10:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%--
    jsp页面上可以使用9大内置对象:request,response,session,application,pageContext,out,config,exception,page
    常用的对象:request,response,session,application,pageContext,out
    四大域对象(能够存储数据的对象):pageContext,request,session,application
    pageContext:作用域只在当前页面有效，不能跨页面共享
    request:作用域在一次请求内有效,通过转发跳转页面，都属于一次请求
    session:作用域时一次会话，同一个会话内的多次请求都可以共享session中的数据
    application:作用域是整个应用程序，只要是访问同一个应用程序的会话，都可以共享application的数据
    --%>

    <!--使用response重定向跳转页面-->
    <%
        response.sendRedirect(request.getContextPath()+"/login.jsp");
    %>
</body>
</html>

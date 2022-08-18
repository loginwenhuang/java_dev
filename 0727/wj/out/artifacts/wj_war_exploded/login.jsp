<%--
  Created by IntelliJ IDEA.
  User: wen
  Date: 2022/7/27
  Time: 17:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>学生系统</title>
    <style>
        h1{
            text-align: center;
        }
        form{
            margin: 0px auto;
            width :50%;
            height: 100px;
            text-align: center;
        }
    </style>
</head>
<body>
<h1>登录界面</h1>>
<form action="/loginServlet" method="get">
    用户名:<br/>
    <input type="text" name="userName" /><br/>
    密码:<br/>
    <input type="password" name="password" /><br/>
    <input type="submit" value="登录" />
    <a href="register.jsp">还没有账号?点击注册</a>
</form>

</body>
    <%
        String message = (String)request.getAttribute("message");
        if("".equals(message) && message ==null){

        }else {
    %>
    <script type = "text/javascript">
        alert("<%=message%>")
</script>
    
<%}%>
</html>
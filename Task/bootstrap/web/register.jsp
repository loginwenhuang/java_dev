<%--
  Created by IntelliJ IDEA.
  User: wen
  Date: 2022/7/28
  Time: 17:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录页面</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/assets/pugins/bootstrap-3.3.7-dist/css/bootstrap.min.css">
    <style>
        .container{
            position: absolute;
            left: 50%;
            top: 50%;
            width: 300px;
            margin-left: -150px;
            margin-top: -150px;
        }
    </style>
</head>
<body>
<div class="container">
    <span style="color: red"><%=request.getAttribute("Remind")==null?"":request.getAttribute("Remind")%></span>
    <span id ="span-my" style="color: blue"></span>
    <form class="form-signin" action="${pageContext.request.contextPath}/Servlet/RegisterServlet">
        <h2 class="form-signin-heading">Please register</h2>
        账号:<input type="text" name="userName" class="form-control" placeholder="userName" required autofocus><br/>
        密码:<input type="password" name="password" class="form-control" placeholder="Password" required><br/>
        <button class="btn btn-lg btn-primary btn-block" type="submit">注册</button>
        <button class="btn btn-lg btn-primary btn-block" type="button" id="backLogin">返回登录</button>
    </form>
</div>
</body>
<script type="text/javascript" src="${pageContext.request.contextPath}/assets/pugins/1.12.4/jquery-1.12.4.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/assets/pugins/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
<script type="text/javascript">
    $(function (){
        var t;
        if(<%=request.getAttribute("flag")%>){
            var n = 3;
            t =setInterval(function (){
                    $("#span-my").text(n+"秒后自动跳转...")
                    if(n==0){
                        clearInterval(t);
                        setTimeout(pageJump,200);
                    }
                    n--;
                },1000);

        }
        function pageJump(){
            window.location.href="${pageContext.request.contextPath}/Servlet/ToLoginServlet";
        }
        $("#backLogin").click(function (){
            pageJump();
        })
    })
</script>
</html>

<%--
  Created by IntelliJ IDEA.
  User: wen
  Date: 2022/7/28
  Time: 16:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录页面</title>
    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/assets/pugins/bootstrap-3.3.7-dist/css/bootstrap.min.css">
    <style>
        .container{
            position: absolute;
            left: 50%;
            top: 50%;
            width: 300px;
            margin-left: -150px;
            margin-top: -150px;
        }
        .btn1-my{
            margin-left: 30px;
        }
        .btn2-my{
            margin-left: 70px;
        }
        h3{
            color: red;
        }
    </style>
</head>
<body>
    <div class="container">
        <form class="form-signin" action="${pageContext.request.contextPath}/Servlet/LoginServlet">
            <h2 class="form-signin-heading">Please sign in</h2>
            账号:<input type="text" name="userName" class="form-control" placeholder="userName" required autofocus><br/>
            密码:<input type="password" name="password" class="form-control" placeholder="Password" required>
            <div class="checkbox">
                <label>
                    <input type="checkbox" value="remember-me" name="rememberMe"> Remember me
                </label>
            </div>
            <button class="btn btn-lg btn-primary btn1-my" type="submit">登录</button>
            <button class="btn btn-lg btn-primary btn-info btn2-my" type="button" id="btn-register">注册</button>
        </form>
        <h3>${Remind==null?"":Remind}</h3>
    </div>
</body>
<script type="text/javascript" src="${pageContext.request.contextPath}/assets/pugins/1.12.4/jquery-1.12.4.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/assets/pugins/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
<script type="text/javascript">
    $(function (){
        $("#btn-register").click(function () {
            window.location.href="${pageContext.request.contextPath}/Servlet/ToRegisterServlet";
        })
    })
</script>
</html>

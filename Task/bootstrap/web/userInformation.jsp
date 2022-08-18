<%--
  Created by IntelliJ IDEA.
  User: wen
  Date: 2022/7/29
  Time: 16:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户信息</title>
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
    </style>
</head>
<body>
<div class="container">
    <form class="form-signin" action="${pageContext.request.contextPath}/Servlet//ModifyUserInformationServlet" method="get">
        <h2 class="form-signin-heading"><%=request.getAttribute("Tips")==null?"个人信息":request.getAttribute("Tips")%></h2>
        姓名:<input type="text" name="stuName" class="form-control" placeholder="userName" required autofocus><br/>
        性别:
            <label class="radio-inline">
                <input type="radio" name="sex"  value="男" checked /> 男
            </label>
            <label class="radio-inline">
                <input type="radio" name="sex"  value="女" /> 女
            </label><br/><br/>
        生日:<input type="date" name="birthday" /><br/><br/>
        <button class="btn btn-lg btn-primary btn-block" type="submit">保存</button>
        <button class="btn btn-lg btn-primary btn-block" type="button" id="back">返回主页面</button>
    </form>
</div>
</body>
<script type="text/javascript" src="${pageContext.request.contextPath}/assets/pugins/1.12.4/jquery-1.12.4.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/assets/pugins/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
<script type="text/javascript">
    $(function(){
        $("#back").click(function (){
            window.location.href = "${pageContext.request.contextPath}/Servlet/ToMainServlet";
        })
    })
</script>
</html>

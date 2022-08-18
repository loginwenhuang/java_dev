<%--
  Created by IntelliJ IDEA.
  User: wen
  Date: 2022/7/27
  Time: 17:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>系统主界面</title>
    <style>
        h1{
            text-align: center;
            color: crimson;
        }
        a{
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
<h1>用户<%=request.getAttribute("userName")%>你好!</h1>
<form action="/mainServlet" method="get">
    该学生信息<br/>
    学生号(stuId):<input type="text" value="<%=request.getAttribute("stuId")%>" name="stuId" readonly="true"/><br/>
    姓名:<input type="text" value="<%=request.getAttribute("stuName")%>" name = "stuName"/><br/>
    性别:<input type="text" value="<%=request.getAttribute("sex")%>" name = "sex"/><br/>
    生日:<input type="text" value="<%=request.getAttribute("birthday")%>" name = "birthday"/><br/>
    <input type ="submit" value="提交" /><a href="index.jsp">退出系统</a>
</form>

</body>
</html>
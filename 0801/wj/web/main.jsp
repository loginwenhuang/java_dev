<%--
  Created by IntelliJ IDEA.
  User: wen
  Date: 2022/8/1
  Time: 9:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<html>
<head>
    <title>Title</title>
    <style>
        a{
            text-decoration: none;
        }
        input{
            width: auto;
            text-align: center;
        }
        td{
            text-align: center;
        }
    </style>
</head>
<body>
<table border="1" align="center">
    <caption>学生信息表</caption>
    <thead>
        <tr>
            <td>学号</td>
            <td>姓名</td>
            <td>性别</td>
            <td>生日</td>
            <td>身高</td>
            <td>班级</td>
            <td>操作</td>
        </tr>
    </thead>
    <tbody>
        <c:forEach items="${studentList}" var="stu">
            <%--<tr>
                <td>${stu}</td>
            </tr>--%>
            <tr>
            <form action="${pageContext.request.contextPath}/StudentServlet/update" method="get">
                <td><input type="text" name="stuId" value="${stu.stuId}" readonly></td>
                <td><input type="text" name="stuName" value="${stu.stuName}"/></td>
                <td><input type="text" name="sex" value="${stu.sex}"/></td>
                <td><input type="date" name="birthday" value="${stu.birthday}" /></td>
                <td><input type="text" name="tall" value="${stu.tall}" /></td>
                <td>
                    <select name="classId">
                        <c:forEach items="${classList}" var="classInfo">
                            <c:if test="${classInfo.classId==stu.classId}">
                                <option value="${classInfo.classId}" selected="selected">${classInfo.className}</option>
                            </c:if>
                            <c:if test="${classInfo.classId!=stu.classId}">
                                <option value="${classInfo.classId}">${classInfo.className}</option>
                            </c:if>
                        </c:forEach>
                    </select>
                </td>
                <td>
                    <input type="submit" value="修改" />
                    &nbsp;
                    <button><a href="${pageContext.request.contextPath}/StudentServlet/delete?stuId=${stu.stuId}">删除</a></button>
                </td>
            </form>
            </tr>

        </c:forEach>
    </tbody>

    <tfoot>
    <tr>
        <td colspan="5"><button><a href="${pageContext.request.contextPath}/StudentServlet/clean">全部删除</a></button></td>
        <td colspan="1"><button><a href="${pageContext.request.contextPath}/ClassInfoServlet/">班级管理</a></button></td>
        <td colspan="1"><button><a href="${pageContext.request.contextPath}/ToIndexServlet">返回首页</a></button></td>
    </tr>
    </tfoot>
</table>

<form method="get" action="${pageContext.request.contextPath}/StudentServlet/insert">
        <table border="1" align="center">
            <tr>
                <td>姓名</td>
                <td>性别</td>
                <td>生日</td>
                <td>身高</td>
                <td>班级</td>
            </tr>
            <tr>
                <td><input type="text" name="stuName"/></td>
                <td><input type="text" name="sex"/></td>
                <td><input type="date" name="birthday"/></td>
                <td><input type="text" name="tall"/></td>
                <td>
                    <select name="classId">
                        <c:forEach items="${classList}" var="classInfo">
                            <option value="${classInfo.classId}">${classInfo.className}</option>
                        </c:forEach>
                    </select>
                </td>>
            </tr>
            <tr>
                <td colspan="5">
                    <input type="submit" value="添加"/>
                </td>
            </tr>
</table>
</form>
</body>
</html>

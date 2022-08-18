<%--
  Created by IntelliJ IDEA.
  User: wen
  Date: 2022/8/1
  Time: 17:05
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
    <tr>
        <td>班级编号</td>
        <td>班级名称</td>
        <td>操作</td>
    </tr>
        <c:forEach items="${classInfoList}" var="classInfo">
                <tr>
                    <form action="${pageContext.request.contextPath}/ClassInfoServlet/update">
                    <td><input type="text" name="classId" value="${classInfo.classId}" readonly /></td>
                    <td><input type="text" name="className" value="${classInfo.className}" /></td>
                    <td>
                        <input type="submit" value="修改"/>
                        &nbsp;
                        <button><a href="${pageContext.request.contextPath}/ClassInfoServlet/delete?classId=${classInfo.classId}">删除</a></button>
                    </td>
                    </form>
                </tr>

        </c:forEach>
    <tr>
        <td colspan="2">
            <button><a href="${pageContext.request.contextPath}/ClassInfoServlet/clean" onclick="return confirm('确认删除?')">全部删除</a></button>
        </td>
        <td colspan="1">
            <button><a href="${pageContext.request.contextPath}/StudentServlet/">返回</a></button>
        </td>
    </tr>
</table>
<form action="${pageContext.request.contextPath}/ClassInfoServlet/insert" method="get">
    <table border="1" align="center">
        <tr>
            <td>班级名称</td>
        </tr>
        <tr>
            <td>
                <input type="text" name="className" />
            </td>
        </tr>
        <tr>
            <td>
                <input type="submit"value="添加" />
            </td>
        </tr>
    </table>
</form>

</body>
</html>

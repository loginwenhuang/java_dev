<%--
  Created by IntelliJ IDEA.
  User: wen
  Date: 2022/8/2
  Time: 9:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加</title>
</head>
<body>

        <form method="get" action="${pageContext.request.contextPath}/WorkerServlet/insert">
            <table border="1" align="center">
                <tr>
                    <td>名称</td>
                    <td>介绍</td>
                    <td>操作</td>
                </tr>
                <tr>
                    <td><input type="text" name="name" /></td>
                    <td><input type="text" name="info" /></td>
                    <td><input type="submit" value="添加" /></td>
                </tr>
            </table>
        </form>

</body>
</html>
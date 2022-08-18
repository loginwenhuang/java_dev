<%--
  Created by IntelliJ IDEA.
  User: wen
  Date: 2022/7/28
  Time: 17:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<html>
<head>
    <title>主页</title>
    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/assets/pugins/bootstrap-3.3.7-dist/css/bootstrap.min.css">
</head>
<body>
    <button type="button" class="btn btn-primary" id="btn-user">用户信息</button>
    <button type="button" class="btn btn-primary" id="btn-book">图书信息</button>
    <button type="button" class="btn btn-primary" id="btn-">退出登录</button>
    <button type="button" class="btn btn-primary" id="btn-logout">注销</button>
    <div class="modal fade" tabindex="-1" role="dialog"  id="userModal">
        <div class="modal-dialog modal-sm" role="document">
            <div class="modal-content">
                <table class="table table-bordered">
                    <caption>个人信息</caption>
                    <thead>
                    <tr>
                        <td>学号</td>
                        <td>姓名</td>
                        <td>性别</td>
                        <td>生日</td>
                        <td>用户编号</td>
                    </tr>
                    </thead>
                    <tbody>
                    <tr>
                        <td>${student.stuId}</td>
                        <td>${student.stuName}</td>
                        <td>${student.sex}</td>
                        <td>${student.birthday}</td>
                        <td>${student.userId}</td>
                    </tr>
                    </tbody>
                </table>
                <button class="btn btn-lg btn-primary btn-block" type="button" id="modify">修改</button>
            </div>
        </div>
    </div>
    <div class="modal fade" tabindex="-1" role="dialog"  id="bookModal">
            <div class="modal-dialog modal-lg" role="document">
                <div class="modal-content">
                <table class="table table-bordered">
                    <caption>图书信息表</caption>
                    <thead>
                        <tr>
                            <td>书号</td>
                            <td>书名</td>
                            <td>作者</td>
                            <td>价格</td>
                            <td>生产日期</td>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach items="${books}" var="book">
                            <tr>
                                <td>${book.bookId}</td>
                                <td>${book.title}</td>
                                <td>${book.authors}</td>
                                <td>${book.unitPrice}</td>
                                <td>${book.pucDate}</td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>
    </div>
</body>
<script type="text/javascript" src="${pageContext.request.contextPath}/assets/pugins/1.12.4/jquery-1.12.4.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/assets/pugins/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
<script type="text/javascript">
    $(function(){
        $("#btn-user").click(function(){
            $("#userModal").modal();
        })
        $("#btn-book").click(function(){
            $("#bookModal").modal();
        })
        $("#btn-logout").click(function (){
            window.location.href = "${pageContext.request.contextPath}/Servlet/Logout";
        })
        $("#modify").click(function (){
            window.location.href = "${pageContext.request.contextPath}/Servlet/ToModifyServlet";
        })
    })
</script>
</html>
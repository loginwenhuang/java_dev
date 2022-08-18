<%--
  Created by IntelliJ IDEA.
  User: wen
  Date: 2022/8/2
  Time: 9:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<html>
<head>
    <title>部门信息</title>
    <style>
        td{
            text-align: center;
        }
        input{
            text-align: center;
        }
        .small{
            width: 20px;
        }
    </style>
</head>
<body>
<form action="${pageContext.request.contextPath}/WorkerServlet/" method="get" id="mainForm">
    <table border="1" align="center">
        <tr>
            <td colspan="4">
                <input type="text " name="search" value="${search}"/>
                <input type="submit" value="搜索" onclick="submitSearch()"/>
            </td>
        </tr>
        <tr>
            <td>编号</td>
            <td>名称</td>
            <td>介绍</td>
            <td>操作</td>
        </tr>
        <c:forEach items="${pageData.data}" var="worker">
            <tr>
                <td>${worker.id}</td>
                <td>${worker.name}</td>
                <td>${worker.info}</td>
                <td>
                    <button><a href="${pageContext.request.contextPath}/WorkerServlet/toUpdate?id=${worker.id}">修改</a></button>
                    <button><a href="${pageContext.request.contextPath}/WorkerServlet/delete?id=${worker.id}">删除</a></button>
                </td>
            </tr>
        </c:forEach>
        <tr>
            <td>
                第${pageData.pageNo}页/共${pageData.totalPage}页
            </td>
            <td>
                第
                <c:forEach begin="1" end="${pageData.totalPage}" var="i">

                    <c:if test="${pageData.pageNo == i}">
                        <input type="hidden" name="pageNo" value="${i}"/>
                        <span>${i}</span>
                    </c:if>
                    <c:if test="${pageData.pageNo != i}">
                        <button type="button"><a href="${pageContext.request.contextPath}/WorkerServlet/select?pageNo=${i}">${i}</a></button>
                    </c:if>
                </c:forEach>
                页
            </td>
            <td>
                每页<input class="small" type="text" name="pageSize" value="${pageData.pageSize}" onblur="submitSearch()"/>条,共${pageData.totalCount}条
            </td>
            <td>
                <button type="button"><a href="${pageContext.request.contextPath}/WorkerServlet/toAdd">添加</a></button>
                <button type="button"><a href="${pageContext.request.contextPath}/WorkerServlet/reset">重置编号</a></button>
            </td>
        </tr>
    </table>
</form>

<script type="text/javascript">
    function submitSearch(){
        mainForm.submit();
    }
</script>
</body>
</html>


<%--
  Created by IntelliJ IDEA.
  User: wen
  Date: 2022/7/30
  Time: 9:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/assets/pugins/bootstrap-3.3.7-dist/css/bootstrap.min.css">
</head>
<body>
<button type="button" class="btn btn-primary" id="btn-book">图书信息</button>
<div class="modal fade" tabindex="-1" role="dialog"  id="bookModal">
    <div class="modal-dialog modal-lg" role="document">
        <div class="modal-content">
            <table  class="table table-bordered">
                <thead>
                <tr>
                    <td>编号</td>
                    <td>品名</td>
                    <td>价格</td>
                    <td>生产日期</td>
                    <td>生产地址</td>
                </tr>
                </thead>
                <tbody id="goods">
                <%
                    request.setAttribute("allGoods",request.getAttribute("goodsList"));
                %>
                <c:forEach items="${allGoods}" var="goods">
                    <tr>
                        <td>${goods.goodId}</td>
                        <td>${goods.goodName}</td>
                        <td>${goods.price}</td>
                        <td>${goods.pucDate}</td>
                        <td>${goods.pucAddress}</td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</div>
</body>
<script src="<%=request.getContextPath()%>/assets/pugins/1.12.4/jquery-1.12.4.min.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/assets/pugins/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
<script type="text/javascript">
    $(function(){
        $("#btn-book").click(function(){
            $("#bookModal").modal();
        })
    })
</script>
</html>

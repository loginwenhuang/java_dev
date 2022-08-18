<%--
  Created by IntelliJ IDEA.
  User: wen
  Date: 2022/7/28
  Time: 16:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

  <title>首页</title>
  <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/assets/pugins/bootstrap-3.3.7-dist/css/bootstrap.min.css">
  <style>
    #span-my{
      color: red;
    }
  </style>
</head>
<body>
  <div class="btn-group">
    <button type="button" class="btn btn-default dropdown-toggle btn-lg" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
      神秘传送门 <span class="caret"></span>
    </button>
    <ul class="dropdown-menu">

      <li><a href="${pageContext.request.contextPath}/Servlet/ToLoginServlet">系统登录页面</a></li>
      <li><a href="#">虚晃一枪</a></li>
      <li><a href="${pageContext.request.contextPath}/Servlet/ToLoginServlet">系统登录页面</a></li>
      <li role="separator" class="divider">当前在线人数</li>
      <li><a href="#">${count}</a></li>
    </ul>
  </div>
  <span>${Info==null?"":Info}</span><span id="span-my"></span>
</body>
<script type="text/javascript" src="<%=request.getContextPath()%>/assets/pugins/1.12.4/jquery-1.12.4.min.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/assets/pugins/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
<script type="text/javascript">
  $(function (){
    var t;
    if(${Info!=null}){
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
      window.location.href="${pageContext.request.contextPath}/Servlet/ToMainServlet";
    }
  })
</script>
</html>

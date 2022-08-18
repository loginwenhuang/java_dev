<%--
  Created by IntelliJ IDEA.
  User: wen
  Date: 2022/8/4
  Time: 19:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/assets/pugins/bootstrap-3.3.7-dist/css/bootstrap.min.css">
    <style type="text/css">
        *{margin:0px;padding:0px;}
        html,body{height:100%;}
        #container{height:100%;position:relative;}
        #top{height:60px;background-color:#ccc;background-color:#23262E;
            position:relative;border-bottom:1px solid #272727;}
        #top h3{float:left;margin-top:15px;margin-bottom:0px;margin-left:20px;
            width:300px;color:#fff;}
        #top #user-nav {float:right;margin-right:10px;margin-top:20px;
            color:#ccc;width:200px;}
        #top #user-nav a{color:#CCCCCC;}
        #main{position:absolute;top:60px;left:0px;bottom:0px;width:100%;}
        #left{width:150px;height:100%;background-color:#444444;
            border-right:1px solid #272727;float:left}
        ul{list-style-type:none;margin:0px;padding:0px;}
        #left .menu a{display:block;width:100%;padding:5px 0px;text-align:center;
            line-height:30px;color:#fff;text-decoration:none;}
        #left .menu>li>a{border-top: 1px solid #4E4E4E;
            border-bottom: 1px solid #393939;font-size:16px;}
        #left .menu>li>a:hover{background-color:#4E5465;border-left:2px solid #009688}
        #left .menu>li ul{background-color:#2A2A2A;}
        #left .menu>li ul a{background-color:#272727;font-size:14px;
            font-weight:normal;border-top: 1px solid #333333;
            border-bottom: 1px solid #202020;color:rgba(255,255,255,0.7);}
        #left .menu>li ul a:hover{color: rgb(255,255,255);background-color: #272727;}
        #right{height:100%;padding-left:150px;}
        #right iframe{border:none;display:block;width:100%;height:100%;)
    </style>
</head>
<body>
<div id="container">
    <div id="top">
        <h3>图书后台管理</h3>
        <div id="user-nav">欢迎,${"admin".equals(userName)?"管理员admin":"普通用户"}
            &nbsp;|&nbsp;
            <a href="${pageContext.request.contextPath}/Servlet/Logout">注销</a>
        </div>
    </div>
    <div id="main">
        <div id="left">
            <ul class="menu">
                <li><a href="javascript:void(0)">
                    <span class="glyphicon glyphicon-asterisk"></span>
                    图书馆
                </a>
                    <ul>
                        <li>
                            <a href="${pageContext.request.contextPath}/Servlet/main.jsp" target="fmain">
                                图书查询
                            </a>
                        </li>
                        <li>
                            <a href="goods_add.html" target="fmain">
                                图书添加
                            </a>
                        </li>
                    </ul>
                </li>
                <li><a href="javascript:void(0)">
                    <span class="glyphicon glyphicon-user"></span>
                    人事管理1
                </a>
                    <ul>
                        <li><a href="emp_list.html" target="fmain">员工查询</a></li>
                        <li><a href="emp_add.html" target="fmain">员工添加</a></li>
                    </ul>
                </li>
                <li><a href="javascript:void(0)">
                    <span class="glyphicon glyphicon-user"></span>
                    人事管理2
                </a>
                    <ul>
                        <li>
                            <a href="employeeQuery.html" target="fmain">
                                员工查询
                            </a>
                        </li>
                        <li>
                            <a href="employeeAdd.html" target="fmain">
                                员工添加
                            </a>
                        </li>
                        <li>
                            <a href="employeeInfo.html" target="fmain">
                                员工信息
                            </a>
                        </li>
                    </ul>
                </li>
                <li><a href="javascript:void(0)">
                    <span class="glyphicon glyphicon-user"></span>
                    采购管理
                </a>
                    <ul>
                        <li>
                            <a href="purchase_list.html" target="fmain">
                                采购单查询
                            </a>
                        </li>
                        <li>
                            <a href="purchase_create.html" target="fmain">
                                采购单创建
                            </a>
                        </li>
                    </ul>
                </li>
            </ul>
        </div>
        <div id="right">
            <iframe name="fmain"></iframe>
        </div>
    </div>
</div>
<script type="text/javascript" src="<%=request.getContextPath()%>/assets/pugins/1.12.4/jquery-1.12.4.min.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/assets/pugins/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
<script type="text/javascript">
    $(document).ready(function(){
        /*初始化隐藏二级菜单*/
        $(".menu ul").css("display","none");
        $(".menu>li>a").click(function(){
            //$(this).parent().siblings().children("ul").slideUp();
            $(this).next().slideToggle();
        })
    })
</script>
</body>
</html>

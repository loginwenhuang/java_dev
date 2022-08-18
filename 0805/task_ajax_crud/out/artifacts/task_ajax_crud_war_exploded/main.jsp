<%--
  Created by IntelliJ IDEA.
  User: wen
  Date: 2022/8/5
  Time: 16:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/assets/pugins/bootstrap-3.3.7-dist/css/bootstrap.min.css">
    <style>
        td,input{
            text-align: center;
        }
        form{
            margin: 0px;
            padding: 0px;
        }
    </style>
</head>
<body>

<div class="modal fade" tabindex="-1" role="dialog"  id="stuModal">
    <div class="modal-dialog modal-sm" role="document">
        <div class="modal-content">
            <form method="" action="" id="addOrUpdateForm">
                <table border="1" align="center" style="margin-top: 10px">
                    <tr>
                        <td>姓名</td>
                        <td>
                            <input type="hidden" name="studentId" />
                            <input type="text" name="name"/>
                        </td>
                    </tr>
                    <tr>
                        <td>性别</td>
                        <td>
                            <input type="radio" name="sex" value="男"/>男
                            <input type="radio" name="sex" value="女"/>女
                        </td>
                    </tr>
                    <tr>
                        <td>生日</td>
                        <td>
                            <input type="date" name="birthday"/>
                        </td>
                    </tr>
                    <tr>
                        <td>省份</td>
                        <td>
                            <input type="text" name="province"/>
                        </td>
                    </tr>
                    <tr>
                        <td>班级</td>
                        <td>
                            <select name="classId" id="classes">

                            </select>
                        </td>
                    </tr>
                    <tr>
                        <td></td>
                        <td>
                            <button type="button" id="addOrUpdate"></button>
                            <input type="reset" value="重置"/>
                        </td>
                    </tr>
                </table>
            </form>
           <%-- <button class="btn btn-lg btn-primary btn-block" type="button" ></button>--%>
        </div>
    </div>
</div>

<table border="1" align="center" style="width: 500px">
    <tr>
        <td colspan="6">
            <input type="text" name="search"/>
            <button type="button" id="btn-search">搜索</button>
        </td>
        <td colspan="1">
            <button type="button" id="addStu">添加学生</button>
        </td>
    </tr>
    <tr>
        <td>学号</td>
        <td>姓名</td>
        <td>性别</td>
        <td>生日</td>
        <td>省份</td>
        <td>班级</td>
        <td>操作</td>
    </tr>
    <tbody id = "stu">

    </tbody>
    <tfoot >
    <tr>
        <td colspan="6" id="page">

        </td>
        <td colspan="1">
            <button id="openPage">开启分页</button>
        </td>
    </tr>
    </tfoot>
</table>
<button type="button" class="pageNo">测试就jq点击事件</button>
<script type="text/javascript" src="${pageContext.request.contextPath}/assets/pugins/1.12.4/jquery-1.12.4.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/assets/pugins/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
<script type="text/javascript">
    //alert($);
    $(function () {
        //分页切换
        $(document).on("click",".pageNo",function () {
            queryByPage($("#pageInfo").serialize()+"&"+"pageNo="+$(this).text());
        })

        //查询功能
        $("#btn-search").click(function () {
            $.get(
                "${pageContext.request.contextPath}/StudentServlet/search",
                {"search":$("input[name='search']").val()}

            )
        })
        //分页功能
        $("#openPage").click(function (){
            if($("#openPage").text()=="开启分页"){
                $("#openPage").text("关闭分页");
                queryByPage(null);
            }else {
                $("#openPage").text("开启分页");
                $("#page").text("");
                queryStu();
            }
        })

        //显示学生信息
        queryStu();
        //弹出层 表单的班级下拉框初始化`
        loadClassInfo();
        //模态框关闭时触发

        $('#stuModal').on('hidden.bs.modal', function (){
            //更新学生信息
            queryStu();
            //重置表单
            $("#addOrUpdateForm")[0].reset();
        });

        //添加按钮
        $("#addStu").click(function (){
            $("#addOrUpdate").text("添加");
            $("#stuModal").modal();
        });
        //修改
        $(document).on("click",".update",function () {
            $("#addOrUpdate").text("修改");
            var student = $(this).parent().parent().children();
            $("input[name='studentId']").val($(student).eq(0).text());
            $("input[name='name']").val($(student).eq(1).text());

            $("input[value='男']").prop("checked",$(student).eq(2).text()=="男");
            $("input[value='女']").prop("checked",$(student).eq(2).text()=="女");

            $("input[name='birthday']").val($(student).eq(3).text());

            $("input[name='province']").val($(student).eq(4).text());

            $("select[name='classId']").val($(student).eq(5).children().eq(0).val());

            $("#stuModal").modal();
        })
        //删除
        $(document).on("click",".delete",function () {
            if(confirm("确认删除吗?")){
                $(this).parent().parent().remove();
                $.get(
                    "${pageContext.request.contextPath}/StudentServlet/delete",
                    {"studentId":$(this).parent().parent().children().eq(0).text()},
                    function (res){
                        if(res==1){
                            queryStu();
                        }
                    }
                )
            }
        })

        $("#addOrUpdate").click(function () {
            if(confirm("确认提交?")){
                $.ajax({
                    url:"${pageContext.request.contextPath}/StudentServlet/addOrUpdate",
                    data:$("#addOrUpdateForm").serialize(),
                    type:"get",
                    dataType:"json",
                    success:function (){
                    },
                    error:function (){
                    },
                })
                $("#stuModal").modal("hide");
            }
        })
    })

    function queryStu(){
        $.get(
            "${pageContext.request.contextPath}/StudentServlet/allStu",
            function (stuList){
                showStudent(stuList)
            },
            "json"
        )
    }
    function loadClassInfo(){
        $.get(
            "${pageContext.request.contextPath}/StudentServlet/allClass",
            function (classList) {
                console.log(classList);
                var str = "<option value=''>请选择</option>";
                for (let i = 0; i < classList.length; i++) {
                    str += "<option value='"+classList[i].classId+"'>"+classList[i].className+"</option>"
                }
                $("#classes").html(str);
            },
            "json"
        )
    }
    //生成学生信息的表格
    function showStudent(stuList) {
        $("#stu").empty();
        for (let i = 0; i < stuList.length; i++) {
            var stu = stuList[i];
            $("#stu").append(
                $("<tr></tr>").append(
                    $("<td></td>").append(stu.studentId),
                    $("<td></td>").append(stu.name),
                    $("<td></td>").append(stu.sex),
                    $("<td></td>").append(stu.birthday),
                    $("<td></td>").append(stu.province),
                    $("<td></td>").append(
                        stu.className,
                        $("<input type='hidden' />").val(stu.classId)
                    ),
                    $("<td></td>").append(
                        $("<button type='button' class='update'>修改</button>"),
                        $("<button type='button' class='delete'>删除</button>"),
                        $("<input type='hidden' />").val(JSON.stringify(stu))
                    )
                ))
        }
    }
    //生成分页信息
    function showPageInfo(pageInfo){
        $("#page").empty();
        var pageNoStr = "&nbsp;";
        for (let i = 0; i < pageInfo.totalPage; i++) {
            if(pageInfo.pageNo==(Number(i)+1)){
                pageNoStr +="<button type='button' class='pageNo' disabled>"+(Number(i)+1)+"</button>&nbsp";
            }else {
                pageNoStr +="<button type='button' class='pageNo'>"+(Number(i)+1)+"</button>&nbsp";
            }

        }

        $("#page").append(
            $("<form action='' id='pageInfo'></form>").append(
                "第"+pageInfo.pageNo+"/"+pageInfo.totalPage+"页",
                pageNoStr,
                "每页",
                $("<input type='text' style='width: 25px' name='pageSize'/>").val(pageInfo.pageSize),
                "条",
                "共"+pageInfo.totalCount+"条"
            )
        )
    }
    //分页请求
    function queryByPage(queryInfoOfPage){
        $.get(
            "${pageContext.request.contextPath}/StudentServlet/page",
            queryInfoOfPage,
            function (res){
                showPageInfo(res);
                showStudent(res.data);
            },
            "json"
        )
    }
</script>
</body>
</html>

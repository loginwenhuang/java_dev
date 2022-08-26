<%--
  Created by IntelliJ IDEA.
  User: wen
  Date: 2022/8/25
  Time: 11:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>分类</title>
</head>
<body>
<table id="category" border="1">

</table>
<form id="frm">
    <input type="hidden" id="url" />
    <input type="hidden" name="categoryId" id="cateId" />
    分类名:
    <input type="text" name="categoryName" id="cateName" />
    <input type="button" value="提交" id="addBtn">
    <input type="button" value="提交修改" id="updateBtn" />
</form>
<script type="text/javascript" src="${pageContext.request.contextPath}/assets/jquery-各种版本/3.2.1/jquery-3.2.1.min.js"></script>
<script type="text/javascript">

    $(function () {
        initPage();

        $("#addBtn").click(function (){
            $.ajax({
                type:"get",
                url:"${pageContext.request.contextPath}/category/add",
                data:$("#frm").serialize(),
                success:function (res) {
                    initPage();
                    if(res.code==0){
                        alert("成功")
                    }else {
                        alert("失败")
                    }
                },
                dataType:"json"
            })
        })


        $(document).on("click",".update",function (){
            var children = $(this).parent().parent().children();
            console.log(children);
            $("#cateId").val($(children).eq(0).text());
            $("#cateName").val($(children).eq(1).text());
            $("#url").val("${pageContext.request.contextPath}/category/update");
        })

        $("#updateBtn").click(function () {
            $.ajax({
                type:"get",
                url:$("#url").val(),
                data:$("#frm").serialize(),
                success:function (res) {
                    initPage();
                    if(res.code==0){
                        alert("成功")
                    }else {
                        alert("失败")
                    }
                },
                dataType:"json"
            })
        })


        $(document).on("click",".delete",function (){
            $.ajax({
                type:"get",
                url:"${pageContext.request.contextPath}/category/delete",
                data:"categoryId="+$(this).parent().parent().children().eq(0).text(),
                success:function (res) {
                    initPage();
                    if(res.code==0){
                        alert("成功")
                    }else {
                        alert("失败")
                    }
                },
                dataType:"json"
            })
        })

    })

    function initPage(){
        $("#cateId").val("");
        $("#frm")[0].reset();
        $.ajax({
            url:"${pageContext.request.contextPath}/category/list",
            dataType:"json",
            success:function (res){
                console.log(res);
                if(res.code==0){
                    $("#category").html(
                        "<tr><td>分类编号</td><td>分类名</td><td>操作</td></tr>"
                    );
                    for (let i = 0; i < res.data.length; i++) {
                        console.log(res)
                        var cate = res.data[i];
                        $("#category").append(
                            $("<tr></tr>").append(
                                $("<td></td>").html(cate.categoryId),
                                $("<td></td>").html(cate.categoryName),
                                $("<td></td>").html("<input type='button' value='修改' class='update'/>"),
                                $("<td></td>").html("<input type='button' value='删除' class='delete'/>")
                            )
                        )
                    }
                }
            }
        })
    }
</script>
</body>
</html>

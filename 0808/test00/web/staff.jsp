<%--
  Created by IntelliJ IDEA.
  User: wen
  Date: 2022/8/8
  Time: 14:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/pugins/bootstrap-3.3.7-dist/css/bootstrap.min.css">
</head>
<body>
<div class="modal fade" tabindex="-1" role="dialog"  id="staffModal">
    <div class="modal-dialog modal-sm" role="document">
        <div class="modal-content">
            <form id="addForm">
                <table border="1" align="center">
                    <tr>
                        <td>姓名</td>
                        <td>
                            <input type="text" name="s_name" />
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
                            <input type="date" name="birthday" />
                        </td>
                    </tr>
                    <tr>
                        <td>手机</td>
                        <td>
                            <input type="text" name="phone" />
                        </td>
                    </tr>
                    <tr>
                        <td>班级</td>
                        <td>
                            <select name="d_id" id="department">

                            </select>
                        </td>
                    </tr>
                    <tr>
                        <td colspan="2">
                            <input type="button" id="btn-add" value="保存"/>
                        </td>
                    </tr>
                </table>
            </form>
        </div>
    </div>
</div>
<table border="1" align="center">
    <tr>
        <td colspan="6">
            <button type="button" id="btn-modal">添加</button>
        </td>
    </tr>
    <tr>
        <td>编号</td>
        <td>姓名</td>
        <td>性别</td>
        <td>生日</td>
        <td>手机</td>
        <td>班级</td>
    </tr>
    <tbody id="staffInfo">

    </tbody>
</table>
<script type="text/javascript" src="${pageContext.request.contextPath}/assets/pugins/1.12.4/jquery-1.12.4.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/assets/pugins/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
<script type="text/javascript">
    //alert($);
    $(function (){
        query();
        initAdd();
        $("#btn-modal").click(function () {
            $("#staffModal").modal();
        })
        $("#btn-add").click(function () {
            add();
        })
    })
    function add(){
        $.get(
            "${pageContext.request.contextPath}/StaffServlet/add",
            $("#addForm").serialize(),
            function (res) {
                if(res==1){
                    query();
                    initAdd();
                    $("#staffModal").modal("hide");
                }
            }
        )
    }
    function initAdd(){
        $.get(
            "${pageContext.request.contextPath}/StaffServlet/selectD",
            function (res){
                $("#department").empty();
                var str = "<option>请选择</option>";
                for (let i = 0; i < res.length; i++) {
                    var department = res[i];
                    str += "<option value='"+department.d_id+"'>"+department.d_name+"</option>";
                }
                $("#department").append(str);
            },
            "json"
        )
    }
    function query(){
        $.get(
            "${pageContext.request.contextPath}/StaffServlet/select",
            function (res){
                showStaff(res);
            },
            "json"
        )
    }
    function showStaff(staffList){
        $("#staffInfo").empty();
        var str = "";
        for (let i = 0; i < staffList.length; i++) {
            var staff = staffList[i];
            str +="<tr>";
            str +="<td>"+staff.s_id+"</td>"
            str +="<td>"+staff.s_name+"</td>"
            str +="<td>"+staff.sex+"</td>"
            str +="<td>"+staff.birthday+"</td>"
            str +="<td>"+staff.phone+"</td>"
            str +="<td>"+staff.d_name+"</td>"
            str +="</tr>";
        }
        $("#staffInfo").append(str);
    }
</script>
</body>
</html>

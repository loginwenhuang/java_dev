<%--
  Created by IntelliJ IDEA.
  User: wen
  Date: 2022/8/8
  Time: 9:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/pugins/bootstrap-3.3.7-dist/css/bootstrap.min.css">
    <style>
        form{
            margin: 0px;
        }
        td,input{
            text-align: center;
        }
    </style>
</head>
<body>
<div class="modal fade" tabindex="-1" role="dialog"  id="staffModal">
    <div class="modal-dialog modal-sm" role="document">
        <div class="modal-content">
            <form id="addForm">
                <table>
                    <tr>
                        <td>姓名</td>
                        <td>
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
                        <td>手机</td>
                        <td>
                            <input type="text" name="phone"/>
                        </td>
                    </tr>
                    <tr>
                        <td>部门</td>
                        <td>
                            <select name="d_id">
                                <option value="1">产品销售</option>
                                <option value="2">产品测试</option>
                                <option value="3">人事</option>
                            </select>
                        </td>
                    </tr>

                </table>
                <button type="button" id="btn-bc">保存</button>
            </form>

        </div>
    </div>
</div>
    <table border="1" align="center" >
        <tr>
            <td colspan="7">
                <form id="searchForm">
                    姓名:<input type="text" name="search"/>
                    <button type="button" id="btn-search">搜索</button>
                </form>
            </td>
        </tr>
        <tr>
            <td>编号</td>
            <td>姓名</td>
            <td>性别</td>
            <td>生日</td>
            <td>手机</td>
            <td>部门</td>
        </tr>
        <tbody id="staffInfo">

        </tbody>
        <tfoot>
            <tr>
                <td colspan="6">
                    <button type="button" id="btn-add">添加</button>
                </td>
            </tr>
        </tfoot>
    </table>
    <script type="text/javascript" src="${pageContext.request.contextPath}/assets/pugins/1.12.4/jquery-1.12.4.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/assets/pugins/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
<script type="text/javascript">
    $("#btn-search").click(function (){
        $.get(
            "${pageContext.request.contextPath}/StaffServlet/search",
            $("#searchForm").serialize(),
            function (res){
                showStaffInfo(res);
            },
            "json"
        );
    });
    $("#btn-add").click(function (){
        //alert("1");
        $("#staffModal").modal();
    })
    $("#btn-bc").click(function (){
        alert("1");
        $.get(
            "${pageContext.request.contextPath}/StaffServlet/add",
            $("#addForm").serialize(),
            function (res){
                if(res==1){
                    $("#staffModal").modal("hide");
                    query();
                }
            },
            "json"
        );
    })

    $(function (){
        query();
    })
    function showStaffInfo(staffList){
        $("#staffInfo").empty();
        var str = "";
        for (let i = 0; i < staffList.length; i++) {
            var staff = staffList[i];
            str +="<tr>";
            str +="<td>"+staff.s_id+"</td>";
            str +="<td>"+staff.s_name+"</td>";
            str +="<td>"+staff.sex+"</td>";
            str +="<td>"+staff.birthday+"</td>";
            str +="<td>"+staff.phone+"</td>";
            str +="<td>"+staff.d_name+"</td>";
            str +="</tr>";
        }
        $("#staffInfo").append(str);
    }
    function query(){
        $.get(
            "${pageContext.request.contextPath}/StaffServlet/select",
            function (res){
                showStaffInfo(res);
            },
            "json"
        );
    }
</script>
</body>
</html>

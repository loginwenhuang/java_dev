<%--
  Created by IntelliJ IDEA.
  User: wen
  Date: 2022/8/7
  Time: 14:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <table align="center" border="1" id="staffInfo">
        <caption>员工信息表</caption>
        <tr>
            <td>编号</td>
            <td>姓名</td>
            <td>性别</td>
            <td>生日</td>
            <td>手机</td>
        </tr>
    </table>
<script type="text/javascript" src="${pageContext.request.contextPath}/assets/pugins/1.12.4/jquery-1.12.4.min.js"></script>
<script type="text/javascript">
    //alert($);
    $(function (){
        $.get(
            "${pageContext.request.contextPath}/StaffServlet",
            function (staffList) {
                var str = "";
                for (let i = 0; i < staffList.length; i++) {
                    var staff = staffList[i];
                    str +="<tr>";
                    str += "<td>"+staff.id+"</td>"
                    str += "<td>"+staff.name+"</td>"
                    str += "<td>"+staff.sex+"</td>"
                    str += "<td>"+staff.bithday+"</td>"
                    str += "<td>"+staff.phone+"</td>"
                    str +="</tr>";
                }
                $("#staffInfo").append(str);
            },
            "json"
        )
    })
</script>
</body>
</html>

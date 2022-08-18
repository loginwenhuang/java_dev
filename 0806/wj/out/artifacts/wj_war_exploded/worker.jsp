<%--
  Created by IntelliJ IDEA.
  User: wen
  Date: 2022/8/6
  Time: 9:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <table border="1" align="center" id="workerTable">
        <tr>
            <td colspan="5">
                <button id="btn">显示</button>
            </td>
        </tr>
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
        $(function () {
            alert($)
            $("#btn").click(function (){
                show();
            })

        })
        function show(){
            $.get(
                "${pageContext.request.contextPath}/WorkerServlet",
                function (workList) {
                    console.log(workList);
                    var str = "";
                    for (let i = 0; i < workList.length; i++) {
                        var worker = workList[i];
                        str += "<tr>"
                        str += "<td>"+worker.id+"</td>"
                        str += "<td>"+worker.name+"</td>"
                        str += "<td>"+worker.sex+"</td>"
                        str += "<td>"+worker.birthday+"</td>"
                        str += "<td>"+worker.phone+"</td>"
                        str += "</tr>"
                    }
                    $("#workerTable").append(str);
                },
                "json"
            )
        }
    </script>
</body>
</html>

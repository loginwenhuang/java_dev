<%--
  Created by IntelliJ IDEA.
  User: wen
  Date: 2022/8/5
  Time: 8:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <hr/>
  <button id="btn1">Jq Ajax Get</button>
  <button id="btn2">Jq Ajax Post</button>
  <button id="btn3">Jq Ajax</button>
  <hr/>
    <div id="mydiv" style="width: 500px;height: 300px;border:1px solid black">

    </div>
  <script type="text/javascript" src="${pageContext.request.contextPath}/assets/pugins/1.12.4/jquery-1.12.4.min.js"></script>
  <script type="text/javascript">
    var xhr;
    function getTime(){
      //创建Ajax对象
      xhr = new XMLHttpRequest();
      //设置状态变化的回调函数
      xhr.onreadystatechange = function (){
        if(xhr.readyState==4&&xhr.status == 200){
          var myDiv = document.getElementById("mydiv")
          myDiv.innerHTML = xhr.responseText;
        }
      }
      //设置发送方式和请求地址 URL
      xhr.open("GET","${pageContext.request.contextPath}/AjaxServlet");
      //发送请求
      xhr.send();
    }
    alert($);
    $(function (){
      $("#btn1").click(function (){
        $.get(
          "${pageContext.request.contextPath}/AjaxServlet",
                {name:"张三",sex:"男"},
                function (res) {
                  console.log(res);
                  var str = "姓名:"+res.name+" 性别:"+res.sex+" 学号:"+res.id;
                  $("#mydiv").append("<p>"+str+"</p>");
                },
                "json"
        );
      })

      $("#btn2").click(function (){
        $.post(
                "${pageContext.request.contextPath}/AjaxServlet",
                {name:"张三",sex:"男"},
                function (res) {
                  console.log(res);
                  var str = "姓名:"+res.name+" 性别:"+res.sex+" 学号:"+res.id;
                  $("#mydiv").append("<p>"+str+"</p>");
                },
                "json"
        );
      })
      $("#btn3").click(function (){
        $.ajax({
          url:"${pageContext.request.contextPath}/AjaxServlet",
          data:{},
          type:"post",
          dataType:"json",
          success:function (res){
            var str = "姓名:"+res.name+" 性别:"+res.sex+" 学号:"+res.id;
            $("#mydiv").append("<p>1"+str+"</p>")
          },
          error:function (xhr,msg) {
            alert(msg);
            console.log(xhr)
          }
        })
      })

    })
  </script>
  </body>
</html>

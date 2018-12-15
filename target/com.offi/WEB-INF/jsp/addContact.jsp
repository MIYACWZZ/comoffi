<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/12/13
  Time: 18:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="en">
<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <title>添加联系人</title>
</head>
<body>
<script type="text/javascript">
    $(document).ready(function(){
        $("#addContact").click(function(){
            alert("点击成功");
            //获取数据
            var name = $("#name").val();
            var tel = $("#tel").val();
            var phone = $("#phone").val();
            var qq = $("#qq").val();
            //联系人json对象
            var contactEntity = {
                "name" : name,
                "tel" : tel,
                "phone" : phone,
                "qq" : qq
            };
            $.ajax({
                url : "/addContData",
                timeout : 2000,
                type : "post",
                contentType : "application/json charset=utf-8",
                data : JSON.stringify(contactEntity),
                success : function (data) {
                    alert("成功了！")
                },
                error : function () {
                    alert("添加失败")
                }
            })
        });
    });

// $(function(){
//     $("#addContact").click(function(){
//         //获取数据
//         var name = $("#name").val();
//         var tel = $("#tel").val();
//         var phone = $("#phone").val();
//         var qq = $("#qq").val();
//         //联系人json对象
//         var contactEntity = {
//             "name" : name,
//             "tel" : tel,
//             "phone" : phone,
//             "qq" : qq
//         };
//
//         alert("keyi!!");
//         $.ajax({
//             url : "/addContData",
//             timeout : 2000,
//             type : "post",
//             contentType : "application/json charset=utf-8",
//             data : JSON.stringify(contactEntity),
//             success : function (data) {
//                 alert("成功了！")
//             },
//             error : function () {
//                 alert("添加失败")
//             }
//         })
//     })
//     }
// )
</script>
//填写联系人详情
<form method="post" >
    姓名:<input id="name" type="text" class="form-control form-control-lg" placeholder="输入姓名" ><br/><br/>
    电话:<input id="tel" type="text" class="form-control form-control-lg" placeholder="输入电话" ><br/><br/>
    手机:<input id="phone" type="text" class="form-control form-control-lg" placeholder="输入手机" ><br/><br/>
    QQ:<input id="qq" type="text" class="form-control form-control-lg" placeholder="输入QQ" ><br/><br/>
    <input type="button" id="addContact" value="添加联系人">
</form>

<!-- Optional JavaScript -->
<!-- jQuery first, then Popper.js, then Bootstrap JS -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
</body>
</html>

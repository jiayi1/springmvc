<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page pageEncoding="UTF-8" %>


<cmtitle>SpringMVC Demo 首页</cmtitle>

<%@ page import="java.util.function.Function" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
</head>
<body>
<h1>这里是SpringMVC Demo首页</h1>

<h3>恭喜你,配置成功。</h3>

<form action="login" method="post" id="form">

    <div> 请输入名字:<input type="text" name="name" id="name_text"/></div>
    <div>请输入年龄:<input type="number" name="age" min="1" max="120" value="12"/></div>
    <div>请输入地址:<input type="text" name="addr"/></div>
    <div>请输入数量:<input type="number" name="num"></div>
    <div><input type="submit" name="submit" value="增加" id="check"></div>
</form>

<script>
    function check(){
        var name = $name_text.value();
        alert(name);
    }


</script>
</body>
</html>
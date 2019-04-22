<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/4/21 0021
  Time: 12:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录页面</title>
    <link rel="stylesheet" type="text/css" href="css/textCss.css"/>
</head>
<body>
    <form action="/login" method="post">
        用户：<input class="txt" type="text" name="username"/><br>
        密码：<input class="txt" type="password" name="password"/><br>
        <input type="submit" value="登录"/>
    </form>
</body>
</html>

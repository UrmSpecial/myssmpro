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
    <title>注册页面</title>
</head>
<body>
    <form method="post" action="/register" enctype="multipart/form-data">
        用户名：<input type="text" name="username"/><br/>
        密码：<input type="password" name="pwd"><br/>
        头像：<input type="file" name="mf"/>
        <input type="submit" value="注册"/>
    </form>
</body>
</html>

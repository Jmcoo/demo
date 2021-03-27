<%--
  Created by IntelliJ IDEA.
  User: 22354
  Date: 2021/3/27
  Time: 15:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户信息</title>
</head>
<body>
    登录成功,欢迎欢迎！
<hr>
    账号：${requestScope.user.id}<br/>
    姓名：${requestScope.user.name}<br/>
</body>
</html>

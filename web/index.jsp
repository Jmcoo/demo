<%--
  Created by IntelliJ IDEA.
  User: 22354
  Date: 2021/3/26
  Time: 21:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>login</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/login.css">
  </head>
  <body>
  <div class="main">
    <h1>Login</h1>
    <div class="login_con">
      <form action="${pageContext.request.contextPath}/login/validateLogin" method="post">
        <div class="item">
          <img src="${pageContext.request.contextPath}/img/user.png" alt="">
          <input type="text" placeholder="请输入账号" name="id" required>
        </div>
        <div class="item">
          <img src="${pageContext.request.contextPath}/img/pass.png" alt="">
          <input type="password" placeholder="请输入密码" name="password"  required>
        </div>
        <div class="item1">
          <label><input name="identity" type="radio" value=0 ${login.identity == 0 ? 'checked':''} checked/>用户</label>
          <label><input name="identity" type="radio" value=1 ${login.identity == 1 ? 'checked':''}/>管理员</label>
        </div>
        <div class="btn">
          <input type="submit" value="登录">
        </div>
      </form>
    </div>
  </div>
  </body>
</html>

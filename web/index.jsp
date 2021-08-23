<%--
  Created by IntelliJ IDEA.
  User: 26357
  Date: 2021/8/19
  Time: 22:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>第一个web项目</title>
  </head>
  <body>
  我的第一个web项目
<%--  <%--%>
<%--    out.println("url address is "+request.getRequestURL());--%>
<%--  %>--%>

    <form action="/submit" method="post">
      <div>用户名：<input type="text" name="userName"/></div>
      <div>密码：<input type="password" name="pwd"></div>
      <div><input type="submit" value="登录"></div>
    </form>
  </body>
</html>

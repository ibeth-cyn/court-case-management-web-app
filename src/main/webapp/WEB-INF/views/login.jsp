<%--
  Created by IntelliJ IDEA.
  User: eakpa
  Date: 11/12/2019
  Time: 11:42 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login Page Content</title>
    <link href="https://fonts.googleapis.com/css?family=Noto+Sans&display=swap" rel="stylesheet">
    <style><%@include file="/WEB-INF/views/styles/login.css"%></style>
</head>
<body>
<h1>Login Page for Court Registrars and Judges</h1>
<h3>Enter your Lagos high court email ending in .ng to access your dashboard</h3>
<div>
<form action="/login.co" method="post">
    Email:<br>
    <input type="email" name="email" placeholder="Enter your mail"><br>
    Password:<br>
    <input type="password" name="password" placeholder="Enter your password" title="Password must be at least 8 or more characters including 1 uppercase letter, 1 lowercase letter and numeric characters"
           required pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}"><br>

    <!--TODO: if there is time, implement reset password functionality-->
    <button type="submit"><strong>LOGIN TO DASHBOARD</strong></button>
</form>
</div>
</body>
</html>

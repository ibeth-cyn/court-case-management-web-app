<%--
  Created by IntelliJ IDEA.
  User: eakpa
  Date: 11/11/2019
  Time: 10:49 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Welcome page content</title>
    <link href="https://fonts.googleapis.com/css?family=Noto+Sans&display=swap" rel="stylesheet">
    <style><%@include file="/WEB-INF/views/styles/welcome.css"%></style>
</head>
<body>
<h1>Welcome to the Case Management system</h1>
<h3 class="top">Click on one of these links to start</h3>
<section>
    <div class="description">
        <img src="/images/lawyer.png">
        <h3>Lawyers</h3>
        <p>File a claim on the<br>
            system in 4 easy-to-<br>
            follow steps.</p>
        <a href="/file.co">
            <p><strong>File a claim</strong></p>
            <img class="links" src="/images/arrow_icon.png">
        </a>
    </div>
    <div class="description">
        <img src="/images/registrar.png">
        <h3>Court Registrars</h3>
        <p>Login to your dashboard to<br>
            view filed cases and approve<br>
            a case for designation.</p>
        <a href="/login.co">
            <p><strong>Login to Dashboard</strong></p>
            <img class="links" src="/images/arrow_icon.png">
        </a>
    </div>
    <div class="description">
        <img src="/images/gavel.png">
        <h3>Judges</h3>
        <p>Login to your dashboard to<br>
            view cases on your<br>
            calendar.</p>
        <a href="/login.co">
            <strong><p>Login to Dashboard</p></strong>
            <img class="links" src="/images/arrow_icon.png">
        </a>
    </div>
</section>
</body>
</html>

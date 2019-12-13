<%--
  Created by IntelliJ IDEA.
  User: eakpa
  Date: 11/13/2019
  Time: 11:57 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registrar's Dashboard</title>
    <link href="https://fonts.googleapis.com/css?family=Noto+Sans&display=swap" rel="stylesheet">
    <style><%@include file="/WEB-INF/views/styles/dashboard.css"%></style>
</head>
<body>
<h1>View List of Filed Claims</h1>
<br><br>
<main>
    <table id="hello">
        <thead>
        <tr>
            <th>Claimant</th>
            <th>Brief Description</th>
            <th>Status</th>
            <th>Approve Case</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td>Hello</td>
            <td>Hello</td>
            <td>Hello</td>
            <td><button name="approve" onclick="approve()" type="button"><strong>APPROVE</strong></button></td>
        </tr>
        </tbody>
    </table>
</main>
<script src="/javascript/approve.js" type="text/javascript"></script>
</body>
</html>

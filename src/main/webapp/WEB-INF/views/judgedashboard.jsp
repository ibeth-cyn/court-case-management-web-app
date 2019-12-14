<%--
  Created by IntelliJ IDEA.
  User: eakpa
  Date: 11/18/2019
  Time: 11:35 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Judge's Dashboard</title>
    <link href="https://fonts.googleapis.com/css?family=Noto+Sans&display=swap" rel="stylesheet">
    <style><%@include file="/WEB-INF/views/styles/dashboard.css"%></style>
</head>
<body>
<form action="judgelogout.co" method="post" >
    <button name="logout" type="submit"><strong>Logout</strong></button>
</form>
<h1>View Cases on your Calendar</h1>
<br><br>
<c:forEach items="${listCases}" var="cases" varStatus="loop">
    <p>${cases.claimantName} <span>vs</span> ${cases.defendantName}</p>
</c:forEach>
</body>
</html>

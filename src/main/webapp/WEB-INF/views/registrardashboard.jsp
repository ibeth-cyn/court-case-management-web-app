<%--
  Created by IntelliJ IDEA.
  User: eakpa
  Date: 11/13/2019
  Time: 11:57 AM
  To change this template use File | Settings | File Templates.
--%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registrar's Dashboard</title>
    <link href="https://fonts.googleapis.com/css?family=Noto+Sans&display=swap" rel="stylesheet">
    <style><%@include file="/WEB-INF/views/styles/dashboard.css"%></style>
</head>
<body>
<form action="logout.co" method="post" >
    <button name="logout" type="submit"><strong>Logout</strong></button>
</form>
<h1>View List of Filed Claims</h1>
<br><br>
<main>
    <table>
        <thead>
        <tr>
            <th>Claimant</th>
            <th>Defendant</th>
            <th>Brief Description</th>
            <th>Approve Case</th>
        </tr>
        </thead>
        <c:forEach items="${listCases}" var="cases" varStatus="loop">
        <tbody>
            <tr>
                <td>${cases.claimantName}</td>
                <td>${cases.defendantName}</td>
                <td>${cases.briefDescription}</td>
                <td><a href="/approve.co?claimantName=${cases.claimantName}&defendantName=${cases.defendantName}
                &briefDescription=${cases.briefDescription}"><strong>APPROVE</strong></a></td>
            </tr>
        </tbody>
        </c:forEach>
    </table>
</main>
</body>
</html>

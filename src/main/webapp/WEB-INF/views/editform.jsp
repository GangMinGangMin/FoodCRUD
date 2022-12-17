<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Edit Form</title>
</head>
<body>
<h1>Edit Form</h1>

<%--@elvariable id="u" type=""--%>
<form:form modelAttribute="u" method="POST" action="../editok">
    <form:hidden path="seq"/>
    <table id="edit">
        <tr><td>음식이름:</td><td><form:input path="Fname" /></td></tr>
        <tr><td>종류:</td><td><form:input path="kind" /></td></tr>
        <tr><td>가격:</td><td><form:input path="price" /></td></tr>
        <tr><td>내용:</td><td><form:textarea cols="50" rows="5" path="customer" /></td></tr>
    </table>
    <input type="submit" value="Edit"/>
    <input type="button" value="cancel" onclick="history.back()">
</form:form>

</body>
</html>
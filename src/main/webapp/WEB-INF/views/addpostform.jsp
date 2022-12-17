<%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 2022-12-03
  Time: 오후 12:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
</head>
<body>

<h1>Add New Post</h1>
<form action="addok" method="post">
    <table id="edit">
        <tr><td>음식이름:</td><td><input type="text" name="fname"/></td></tr>
        <tr><td>종류:</td><td><input type="text" name="kind"/></td></tr>
        <tr><td>가격:</td><td><input type="text" name="price"/></td></tr>
        <tr><td>내용:</td><td><textarea cols="50" rows="5" name="customer"></textarea></td></tr>
    </table>
    <button type="button" onclick="location.href='list'">목록보기</button>
    <button type="submit">등록하기</button>
</form>

</body>
</html>

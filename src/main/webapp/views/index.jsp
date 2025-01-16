<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Spring Framework</title>
</head>
<body>
Welcome to Spring Framework!
<form action="addAlien" method="POST">
    Enter Alien Id: <input type="number" name="aid"> <br>
    Enter Alien Name: <input type="text" name="aname"> <br>
    <input type="submit">
</form>

<form action="getAlien" method="GET">
    Enter Alien Id: <input type="number" name="id"> <br>
    <input type="submit">
</form>
</body>
</html>
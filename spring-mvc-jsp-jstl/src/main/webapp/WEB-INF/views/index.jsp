<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: barto
  Date: 11.12.2018
  Time: 09:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1><c:out value="${helloMessage}"/></h1>
<form action="add" method="post">
    <input name="title" placeholder="Title"/><br>
    <textarea name="content">Content here</textarea><br>
    <input name="tags" placeholder="tag1,tag2, tag3"/><br>
    <input type="submit" value="Add"/>
</form>
</body>
</html>

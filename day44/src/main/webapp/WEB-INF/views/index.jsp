<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:url value="/" var="root"></c:url>
</head>
<body>
<nav>
	<a href="${root }">home</a>
	<a href="${root }intro.do">intro</a>
	<a href="${root }emp/list.do">emp</a>
</nav>
<div class="container">
	<div class="jumbotron">
		<h2>hello world</h2>
	</div>
</div>
</body>
</html>
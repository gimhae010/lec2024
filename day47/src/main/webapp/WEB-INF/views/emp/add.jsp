<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@ include file="../template/menu.jspf" %>
<h2>입력 페이지</h2>
<form action="./" method="post">
	<div class="form-group">
		<input class="form-control" name="ename" placeholder="ename">
	</div>
	<div class="form-group">
		<input class="form-control" name="pay" placeholder="pay">
	</div>
	<div class="form-group">
		<button>입력</button>
	</div>
</form>
</body>
</html>
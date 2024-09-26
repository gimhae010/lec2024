<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%@ include file="../template/head.jspf" %>
</head>
<body>
<%@ include file="../template/menu.jspf" %>
<h2 class="page-header">입력 페이지</h2>
<form action="insert.do" method="post">
	<div class="form-group">
		<label>ename</label>
		<input name="ename" class="form-control">
	</div>
	<div class="form-group">
		<label>pay</label>
		<input name="pay" class="form-control">
	</div>
	<div class="form-group">
		<button class="btn btn-primary btn-block">입력</button>
		<button type="reset" class="btn btn-default btn-block">취소</button>
	</div>
</form>
<%@ include file="../template/footer.jspf" %>
</body>
</html>
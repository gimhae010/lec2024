<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>jsp test page</h1>
	<p><%=1+2+3+4+5 %></p>
	<p>${pageContext.request}</p>
</body>
</html>
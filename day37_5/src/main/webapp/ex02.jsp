<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
String msg="문자열";
pageContext.setAttribute("msg1", msg);
request.setAttribute("msg2", msg);
session.setAttribute("msg3", msg);
application.setAttribute("msg4",msg);

pageContext.setAttribute("nalja", new java.util.Date());

%>
<ul>
	<li>${msg1 }</li>
	<li>${msg2 }</li>
	<li>${msg3 }</li>
	<li>${msg4 }</li>
	<li>${nalja }</li>
</ul>

</body>
</html>
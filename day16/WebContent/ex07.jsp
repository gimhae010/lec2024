<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>link</h1>
	<p><a href="ex06.jsp?id=admin&pw=abcd">admin</a></p>
	<p><a href="ex06.jsp?id=root&pw=aabb">root</a></p>
	<p><a href="ex06.jsp?id=guest&pw=1234">guest</a></p>
	<%//http://192.168.54.71:8080/day16/ex06.jsp?id=abcd&pw=1234 %>
	<form action="ex06.jsp">
		<input type="text" name="id"><br>
		<input type="text" name="pw"><br>
		<input type="radio" name="ra1" value="ra1">radio1
		<input type="radio" name="ra1" value="ra2">radio2
		<input type="radio" name="ra1" value="ra3">radio3
		<br>
		<%//?id=&pw=&ch1=ch1&ch1=ch3 %>
		<input type="checkbox" name="ch1" value="ch1">check1
		<input type="checkbox" name="ch1" value="ch2">check2
		<input type="checkbox" name="ch1" value="ch3">check3
		<br>
		
		
		
		<input type="submit" value="전달">
	</form>
</body>
</html>















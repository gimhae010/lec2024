<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<table border="0" width="100%">
		<tr>
			<td width="200">
			<a href="./">
			<img alt="" src="main_logo.png">
			</a>
			</td>
			<td></td>
			<td width="200"></td>
		</tr>
		<tr>
			<td bgcolor="gray"></td>
			<td bgcolor="gray" align="center">
				<a href="ex01.html" style="color:white">ex01</a>
				<a href="ex02.jsp" style="color:white">ex02</a>
				<a href="ex03.jsp" style="color:white">ex03</a>
				<a href="ex04.jsp" style="color:white">ex04</a>
				<a href="ex05.jsp" style="color:white">ex05</a>
				<a href="ex06.jsp" style="color:white">ex06</a>
				<a href="ex07.jsp" style="color:white">ex07</a>
				<a href="ex12.jsp" style="color:white">구구단</a>
				<a href="ex13.jsp" style="color:white">구구단2</a>
				<a href="ex15.jsp" style="color:white">comming</a>
			</td>
			<td bgcolor="gray"></td>
		</tr>
		<tr>
			<td colspan="3">
				<!-- 내용시작 -->
	<h1>구구단 출력</h1>
	<%
	int su=Integer.parseInt(request.getParameter("gugu"));
	%>
	<ul>
		<%for(int i=1; i<10; i++){ %>
		<li><%out.print(su+"x"+i+"="+su*i); %></li>
		<%} %>
	</ul>
<!-- 내용끝 -->
			</td>
		</tr>
		<tr>
			<td></td>
			<td align="center">Copyright &copy;2024</td>
			<td></td>
		</tr>
	</table>
</body>
</html>
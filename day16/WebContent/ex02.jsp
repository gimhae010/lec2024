<%@ page language="java" %>
<%@ page contentType="text/html; charset=EUC-KR"%>
<%@ page pageEncoding="EUC-KR"%>
<%@ page import="java.util.Date" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<%!
	// @는 디렉티브 - 클래스밖
	int su1=1111;
	void func01(){}
	class Inner{}
%>
<%!
	// !는 선언부 - 클래스 안 메서드 밖 (변수,메서드)
	int su2=2222;
	void func02(){}
%>
<body>
	<h1>jsp 테스트 페이지</h1>
	<%
		// 스크립트릿 - 메서드안 (main )
		for(int i=0; i<3; i++){
			out.print("화면에 출력<br>");
		}
	
		for(int i=0; i<3; i++){
	%>
	
	<% out.println("분리"); %>
	<br>
	<%} %>
</body>
</html>












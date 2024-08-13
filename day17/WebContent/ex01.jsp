<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%
String name=application.getContextPath();
System.out.println(name);
System.out.println(application.getInitParameter("con1"));
// jsp, servlet
// servlet - 3.1
// jsp - 2.3

%>
</body>
</html>
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

//session.setMaxInactiveInterval(15*60);
//System.out.println(session.getId());
//System.out.println(session.getId());
session.invalidate();
System.out.println(session.getId());
//System.out.println(session.getMaxInactiveInterval()/60);
//System.out.println(session.getLastAccessedTime());
%>
</body>
</html>
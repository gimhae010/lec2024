<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@ page import="java.sql.*,com.inje.*" %>
<%
String num=request.getParameter("idx");
String sql="delete from bbs02 where num="+num;
try(
		Connection conn=OracleDB.getConnection();
		Statement stmt=conn.createStatement();
		){
	stmt.executeUpdate(sql);
}
%>
</body>
</html>
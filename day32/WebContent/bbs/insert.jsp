<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="bean" class="com.bbs.model.BbsBean"></jsp:useBean>
<jsp:setProperty property="sub" name="bean"/>
<jsp:setProperty property="id" name="bean"/>
<jsp:setProperty property="content" name="bean"/>
<%@ page import="java.sql.*,com.bbs.util.*" %>
<%
String sql="insert into bbs02 (num,sub,id,content,nalja) values (bbs02_seq.nextval,'"
			+bean.getSub()+"','"+bean.getId()+"','"+bean.getContent()+"',sysdate)";
try(
	Connection conn=OracleDB.getConnection();
	Statement stmt=conn.createStatement();	
	){
	stmt.executeUpdate(sql);
}
%>
<jsp:forward page="list.jsp"></jsp:forward>
</body>
</html>










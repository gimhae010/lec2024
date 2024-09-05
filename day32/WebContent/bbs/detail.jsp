<%@page import="java.net.URLEncoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<jsp:include page="../template/head.jsp">
	<jsp:param value=".." name="path"/>
</jsp:include>
<style type="text/css">
	#content form{
		width: 400px;
		margin: 0px auto;
	}
</style>
</head>
<body>
<jsp:include page="../template/header.jsp"></jsp:include>
<jsp:include page="../template/menu.jsp">
	<jsp:param value=".." name="path"/>
</jsp:include>
<jsp:useBean id="bean" class="com.bbs.model.BbsBean"></jsp:useBean>
<jsp:setProperty property="num" name="bean"/>
<%@ page import="java.sql.*,com.bbs.util.*,java.util.*" %>
<%
String sql="select * from bbs02 where num="+bean.getNum();
try(
	Connection conn=OracleDB.getConnection();
	Statement stmt=conn.createStatement();
	ResultSet rs=stmt.executeQuery(sql);
	){
	if(rs.next()){
		bean.setSub(rs.getString("sub"));
		bean.setId(rs.getString("id"));
		bean.setContent(rs.getString("content"));
		bean.setNalja(rs.getTimestamp("nalja"));
	}
}

%>
	<h2 class="text-center">상세 페이지</h2>
	<form action="edit.jsp">
		<input type="hidden" name="num" value='<jsp:getProperty property="num" name="bean"/>'> 
	  <div class="form-group">
	    <label for="sub">제목</label>
	    <input type="text" class="form-control" name="sub" id="sub" value='<jsp:getProperty property="sub" name="bean"/>' readonly>
	  </div>
	  <div class="form-group">
	    <label for="id">글쓴이</label>
	    <input type="text" class="form-control" name="id" id="id" value='<jsp:getProperty property="id" name="bean"/>' readonly>
	  </div>
	  <div class="form-group">
	    <label for="nalja">날짜</label>
	    <input type="datetime" class="form-control" name="nalja" id="nalja" value='<jsp:getProperty property="nalja" name="bean"/>' disabled="disabled">
	  </div>
	  <div class="form-group">
	    <textarea class="form-control" rows="5" name="content" readonly><jsp:getProperty property="content" name="bean"/></textarea>
	  </div>
	  <button class="btn btn-default">수정</button>
	  <a href="#" class="btn btn-danger" role="button">삭제</a>
	  <a href="#" class="btn btn-default" role="button">답글</a>
	</form>	
<jsp:include page="../template/footer.jsp"></jsp:include>
</body>
</html>

















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
	table td:nth-child(1){
		width: 80px;
	}
	table td:nth-child(3),
	table td:nth-child(4){
		width: 100px;
	}
</style>
</head>
<body>
<jsp:include page="../template/header.jsp"></jsp:include>
<jsp:include page="../template/menu.jsp">
	<jsp:param value=".." name="path"/>
</jsp:include>
<h1 class="text-center">list page</h1>
<p class="text-right"><a href="add.jsp" class="btn btn-primary" role="button">입력</a></p>
<table class="table">
	<thead>
		<tr>
			<th>글번호</th>
			<th>제목</th>
			<th>글쓴이</th>
			<th>날짜</th>
		</tr>
	</thead>
	<tbody>
		<%@ page import="java.sql.*,com.bbs.util.OracleDB" %>
		<%
		String sql="select * from (select rownum as rn, num,sub,id,nalja from"
			+" (select * from bbs02 order by num desc)) where rn between 1 and 10";
		try(
				Connection conn=OracleDB.getConnection();
				Statement stmt=conn.createStatement();
				ResultSet rs=stmt.executeQuery(sql);
				){
		while(rs.next()){ 
		%>
		<tr>
			<td><%=rs.getInt("num") %></td>
			<td><%=rs.getString("sub") %></td>
			<td><%=rs.getString("id") %></td>
			<td><%=rs.getTimestamp("nalja") %></td>
		</tr>
		<%}
		} %>
	</tbody>
</table>

<jsp:include page="../template/footer.jsp"></jsp:include>
</body>
</html>









<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="../css/frame.css">
<style type="text/css">
#content{}
#content>h1{
	margin-top:50px;
	text-align: center;
}
#content>div{
	width: 400px;
	height: 150px;
	border: 1px solid gray;
	border-radius : 20px;
	margin: 50px auto;
	text-align: center;
	line-height: 150px;
	background-color: gray;
	color:white;
}
</style>
<script type="text/javascript">
	setTimeout(function(){
		location.replace('./');
	}, 1000);
</script>
</head>
<body>
<div>
	<div class="header">
		<h1>인제대학교</h1>
		<div>
			<form action="../login/">
				<input type="text" name="id"/>
				<input type="password" name="pw"/>
				<button type="submit">login</button>
				<button type="button">join</button>
			</form>
		</div>
	</div>
	<div id="menu">
		<ul>
			<li><a href="../">home</a></li>
			<li><a href="../intro.jsp">intro</a></li>
			<li><a href="../bbs/">bbs</a></li>
			<li><a href="../login/">login</a></li>
		</ul>
	</div>
	<div id="content">
		<!-- content begin -->
		<%@ page import="java.sql.*, com.inje.OracleDB" %>
		<%
		String num=request.getParameter("num");
		if(request.getMethod().equals("GET")){
			response.sendRedirect("detail.jsp?num="+num);
			return;
		}
		String sql="delete from bbs02 where num="+num;
		try(
				Connection conn=OracleDB.getConnection();
				Statement stmt=conn.createStatement();
				){
			stmt.executeUpdate(sql);
		}
		%>
		<h1>입력 결과</h1>
		
		<div>
			삭제 성공
		</div>
		<!-- content end -->
	</div>
	<div id="footer">
	<p>김해캠퍼스 (50834) 경남 김해시 인제로 197</p>
	<p>Copyright &copy; 2024 INJE University. All rights reserved.</p>
	</div>
</div>
</body>
</html>










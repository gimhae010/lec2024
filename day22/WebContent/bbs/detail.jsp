<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<div>
	<div><img src="https://dummyimage.com/200x100/000/fff.png&text=LOGO"></div>
	<div>
		<center>
		<a href="../">[HOME]</a>
		<a href="../intro.jsp">[Intro]</a>
		<a href="list.jsp">[B B S]</a>
		<a href="../login/login.jsp">[LOGIN]</a>
		</center>
		<hr>
	</div>
	<div>
		<!-- begin content -->
		<center>
		<%@ page import="java.sql.*" %>
		<%
		String idx=request.getParameter("idx");
		
		String sql="select id,sub,nalja,content from bbs01 where num="+idx;
		String driver="oracle.jdbc.driver.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="scott";
		String password="tiger";
		
		String sub="",id="",nalja="",content="";
		
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;
		try{
			Class.forName(driver);
			conn=DriverManager.getConnection(url, user, password);
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);
			if(rs.next()){
				id=rs.getString(1);
				sub=rs.getString(2);
				nalja=rs.getDate(3).toString();
				content=rs.getString(4);
			}
		}finally{
			if(rs!=null)rs.close();
			if(stmt!=null)stmt.close();
			if(conn!=null)conn.close();
		}
		%>
		<h1>��������(<%=idx %>�� ��)</h1>
		
		<table width="500">
			<tr>
				<td width="100">����</td>
				<td colspan="3"><%=sub %></td>
			</tr>
			<tr>
				<td>�۾���</td>
				<td><%=id %></td>
				<td width="100">��¥</td>
				<td><%=nalja %></td>
			</tr>
			<tr>
				<td colspan="4" height="300" valign="top"><%=content.replace("\n", "<br>") %></td>
			</tr>
			<tr>
				<td colspan="4" align="center">
					<a href="edit.jsp?idx=<%=idx%>">[�� ��]</a>
					<a href="del.jsp?idx=<%=idx%>">[�� ��]</a>
				</td>
			</tr>
		</table>
		</center>
		<!-- end content -->
	</div>
	<div>
		<hr>
		<center>
		<p>����ķ�۽� (50834) �泲 ���ؽ� ������ 197</p>
		<p>Copyright &copy; 2024 INJE University. All rights reserved.</p>
		</center>
	</div>
</div>
</body>
</html>
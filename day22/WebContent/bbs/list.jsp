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
			<h1>�Խ���</h1>
			<table border="1" cellspacing="0" width="500" align="center">
				<tr>
					<th width="80">�۹�ȣ</th>
					<th>����</th>
					<th width="100">�۾���</th>
					<th width="100">��¥</th>
				</tr>
				<%@ page import="java.sql.*" %>
				<%
				String search=request.getParameter("search");
				String keyword=request.getParameter("keyword");
				if(search==null)search="sub";
				if(keyword==null)keyword="";
				String driver="oracle.jdbc.driver.OracleDriver";
				String url="jdbc:oracle:thin:@localhost:1521:xe";
				String user="scott";
				String password="tiger";
				Connection conn=null;
				Statement stmt=null;
				ResultSet rs=null;
				String sql="select num,nvl(sub,'�������'),id,nalja from bbs01 ";
				sql+="where "+search+" like('%"+keyword+"%')";
				sql+=" order by num desc";
				try{
					Class.forName(driver);
					conn=DriverManager.getConnection(url, user, password);
					stmt=conn.createStatement();
					rs=stmt.executeQuery(sql);
					while(rs.next()){
				%>
				<tr>
					<td><%=rs.getString(1) %></td>
					<td><a href="detail.jsp?idx=<%=rs.getString(1)%>"><%=rs.getString(2) %></a></td>
					<td><%=rs.getString(3) %></td>
					<td><%=rs.getDate(4) %></td>
				</tr>
				<%
					}
				} finally{
					if(rs!=null)rs.close();
					if(stmt!=null)stmt.close();
					if(conn!=null)conn.close();
				}
				%>
			</table>
			<p>
				<form action="#">
					<select name="search">
						<option value="sub">����</option>
						<option value="id">�۾���</option>
						<option value="content">����</option>
					</select>
					<input type="text" name="keyword">
					<input type="submit" value="�˻�">
				</form>
			</p>
			<p><a href="add.jsp">[�Է�]</a></p>
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
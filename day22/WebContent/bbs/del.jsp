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
		<h1>���� ������</h1>
<%
String idx=request.getParameter("idx");
%>
		<p></p>
		<table align="center" width="200" height="100" border="1" >
			<tr>
				<td align="center">
				<form action="delete.jsp">
					<input type="hidden" name="num" value="<%=idx%>">
					<input type="submit" value="�� ��">
					<input type="button" value="�� ��" onclick="history.back();">
				</form>
				</td>
			</tr>
		</table>
		<p></p>
		<p></p>
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
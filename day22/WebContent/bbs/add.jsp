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
		<h1>�Է� ������</h1>
<%
String sub=request.getParameter("sub");
String content=request.getParameter("content");
if(sub==null) sub="";
if(content==null)content="";
%>
		<form action="insert.jsp">
			<table width="500">
				<tr>
					<td width="100">����</td>
					<td><input value="<%=sub %>" type="text" name="sub" style="width:100%;"></td>
				</tr>
				<tr>
					<td>�۾���</td>
					<td><input type="text" name="id" style="width:100%;"></td>
				</tr>
				<tr>
					<td colspan="2">
						<textarea name="content" rows="5" style="width:100%;"><%=content %></textarea>
					</td>
				</tr>
				<tr>
					<td colspan="2" align="center">
						<input type="submit" value="�� ��">
						<input type="reset" value="�� ��">
						<input type="button" value="�� ��" onclick="history.back();">
					</td>
				</tr>
			</table>
		</form>
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
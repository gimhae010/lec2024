<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<table width="800" align="center">
	<tr>
		<td colspan="2">
			<img alt="logo" src="/day17/imgs/main_logo.png">
		</td>
		<td colspan="2">&nbsp;</td>
		<td colspan="2" align="right">
			[<a href="#">login</a>]
			[<a href="#">join</a>]
		</td>
	</tr>
	<tr>
		<td width="200" bgcolor="gray">&nbsp;</td>
		<td width="100" bgcolor="gray" align="center">[<a href="/day17/index.jsp">HOME</a>]</td>
		<td width="100" bgcolor="gray" align="center">[<a href="/day17/intro.jsp">INTRO</a>]</td>
		<td width="100" bgcolor="gray" align="center">[<a href="/day17/bbs.jsp">B B S</a>]</td>
		<td width="100" bgcolor="gray" align="center">[<a href="#">GUEST</a>]</td>
		<td width="200" bgcolor="gray">&nbsp;</td>
	</tr>
	<tr>
		<td colspan="6" align="center" height="400">
		<!-- content begin -->
<%@ page import="java.util.List,java.util.ArrayList" %>
<%@ page import="java.util.Map,java.util.HashMap" %>
<%
List<Map<String,String>> list=null;
Object obj=application.getAttribute("bbs");
if(obj==null)
	list=new ArrayList<>();
else
	list=(List<Map<String,String>>)obj;

application.setAttribute("bbs", list);

Map<String,String> map=new HashMap<>();
String sub=request.getParameter("sub");
String content=request.getParameter("content");
map.put("sub", sub);
map.put("content",content);

list.add(map);
%>
<a href="bbs.jsp">������� ���ư���</a>
		<!-- content end -->
		</td>
	</tr>
	<tr>
		<td colspan="6" bgcolor="gray" align="center">
			<p>����ķ�۽� (50834) �泲 ���ؽ� ������ 197</p>
			<p>TEL. 055-334-7111</p>
			<p>E-mail. webmaster@inje.ac.kr</p>
			<font color="white">
			Copyright &copy; 1996-2022 INJE University. All rights reserved.
			</font>
		</td>
	</tr>

</table>
</body>
</html>


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
		<td width="100" bgcolor="gray" align="center">[<a href="/day17/guest.jsp">GUEST</a>]</td>
		<td width="200" bgcolor="gray">&nbsp;</td>
	</tr>
	<tr>
		<td colspan="6" align="center" height="400" valign="top" >
		<!-- content begin -->
		<h1>�Խ���</h1>
		<%@ page import="java.util.List,java.util.Map" %>
		<%
		Object obj=application.getAttribute("bbs");
		List<Map<String,String>> list=null;
		if(obj!=null){
			list=(List<Map<String,String>>)obj;
		}
		%>
		<table width="500" align="center" border="1" cellspacing="0">
			<tr>
				<th width="80">�۹�ȣ</th>
				<th>����</th>
			</tr>
			<%
			if(list!=null){ 
				for(int i=0; i<list.size(); i++){
					Map<String,String> map=list.get(i);
			%>
			<tr>
				<td><%out.print(i+1); %></td>
				<td><a href="detail.jsp?idx=<%out.print(i);%>"><%out.print(map.get("sub")); %></a></td>
			</tr>
			<%
				}
			} 
			%>
		</table>
		
		<p><a href="add.jsp">[�Է�]</a></p>
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
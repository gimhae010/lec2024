<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@ include file="../template/menu.jspf" %>
<div class="jumbotron">
	<h2>list page</h2>
	<table class="table">
		<thead>
			<tr>
				<th>사번</th>
				<th>이름</th>
				<th>금액</th>
				<th>날짜</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${list }" var="bean">
			<tr>
				<td><a href="${bean.empno }">${bean.empno }</a></td>
				<td><a href="${bean.empno }">${bean.ename }</a></td>
				<td><a href="${bean.empno }">${bean.pay }</a></td>
				<td><a href="${bean.empno }">${bean.hiredate }</a></td>
			</tr>
			</c:forEach>
		</tbody>
	</table>
</div>
</body>
</html>









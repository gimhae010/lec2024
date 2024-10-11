<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<nav>
	<a href="/">list</a>
	<a href="/add">add</a>
</nav>
	<table>
		<thead>
			<tr>
				<th>글번호</th>
				<th>이름</th>
				<th>download</th>
				<th>download2</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${list }" var="bean">
				<tr>
					<td>${bean.num }</td>
					<td>${bean.name }</td>
					<td>
						<c:if test="${bean.file ne null }">
							<a href="download?f=${bean.file}">download</a>
						</c:if>
					</td>
					<td>
						<c:if test="${bean.file ne null }">
							<a href="download/${bean.file}">download2</a>
						</c:if>
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<a href="add">입력</a>
</body>
</html>






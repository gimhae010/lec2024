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
	<h1>jstl etc2</h1>
	<div id="target">
	<c:import url="https://www.kma.go.kr/weather/forecast/mid-term-rss3.jsp?stnId=159"></c:import>
	</div>
	<script type="text/javascript">
	var div=document.querySelector('#target');
	div.style.display='none';
	document.querySelector('h1').outerHTML=document.querySelector('wf').innerHTML;
	</script>
</body>
</html>
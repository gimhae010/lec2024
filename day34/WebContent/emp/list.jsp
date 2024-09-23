<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- bootstrap CSS -->
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.4.1/dist/css/bootstrap.min.css" integrity="sha384-HSMxcRTRxnN+Bdg0JdbxYKrThecOKuH5zCYotlSAcp1+c8xmyTe9GYg1l9a69psu" crossorigin="anonymous">

<!-- bootstrap theme css -->
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.4.1/dist/css/bootstrap-theme.min.css" integrity="sha384-6pzBo3FDv/PJ8r2KRkGHifhEocL+1X2rVCTTkUfGk7/0pbek5mMa1upzvWbrUbOZ" crossorigin="anonymous">

<!-- jQuery -->
<script src="https://code.jquery.com/jquery-1.12.4.min.js" integrity="sha384-nvAa0+6Qg9clwYCGGPpDQLVpLNn0fRaROjHqs13t4Ggj3Ez50XnGQqc/r8MhnRDZ" crossorigin="anonymous"></script>

<!-- bootstrap JavaScript -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@3.4.1/dist/js/bootstrap.min.js" integrity="sha384-aJ21OjlMXNL5UyIl/XNwTMqvzeRMZH2w8c5cRVpzpU8Y5bApTppSuUkhZXN0VxHd" crossorigin="anonymous"></script>

</head>
<body>
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="/day34/index.do">
        인제대학교
      </a>
    </div>
	  <div class="navbar-nav">
	  	<a class="navbar-text" href="/day34/intro.do">intro</a>
	  	<a class="navbar-text" href="/day34/dept/list.do">dept</a>
	  	<a class="navbar-text" href="/day34/emp/list.do">emp</a>
	  	<a class="navbar-text" href="/day34/login/form.do">login</a>
	  </div>
  </div>
</nav>
	<div class="container">
		<div class="row">
			<div id="content" class="col-md-12">
				<!-- content begin -->
				<h2 class="page-header">리스트 페이지<small>(emp table)</small></h2>
				<table class="table  table-bordered">
					<thead>
						<tr>
							<th>사번</th>
							<th>이름</th>
							<th>연봉</th>
							<th>부서명</th>
						</tr>
					</thead>
					<tbody>
					<%@ page import="java.util.*,com.home.model.*" %>
					<%
					List<EmpDto> list=(List<EmpDto>)request.getAttribute("alist");
					for(EmpDto bean : list){
					%>
						<tr>
							<td><a href="detail.do?sabun=<%=bean.getEmpno() %>"><%=bean.getEmpno() %></a></td>
							<td><a href="detail.do?sabun=<%=bean.getEmpno() %>"><%=bean.getEname() %></a></td>
							<td><a href="detail.do?sabun=<%=bean.getEmpno() %>"><%=bean.getPay() %></a></td>
							<td><a href="detail.do?sabun=<%=bean.getEmpno() %>"><%=bean.getDname()==null?"미지정":bean.getDname() %></a></td>
						</tr>
					<%} %>
					</tbody>
				</table>
				<p>
					<a href="add.do" class="btn btn-primary btn-block" role="button">입력</a>
				</p>
				<!-- content end -->
			</div>
		</div>
		<div class="row">
			<div id="footer" class="col-md-12">
				<address>
					<p>김해캠퍼스 (50834) 경남 김해시 인제로 197</p>
					<p>Copyright &copy; INJE University. All rights reserved.</p>
				</address>
			</div>
		</div>
	</div>
</body>
</html>













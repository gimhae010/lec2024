<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="../css/bootstrap.min.css">
<script type="text/javascript" src="../js/jquery-1.12.4.min.js"></script>
<script type="text/javascript" src="../js/bootstrap.min.js"></script>
</head>
<body>
<nav class="navbar navbar-default">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">
        <img alt="Brand" src="imgs/logo.png">
      </a>
    </div>
    <ul class="nav navbar-nav">
    	<li class="active"><a href="../index.do">HOME</a></li>
    	<li><a href="../intro.do">INTRO</a></li>
    	<li><a href="./list.do">EMP</a></li>
    	<li><a href="../login/login.do">LOGIN</a></li>
    </ul>
  </div>
</nav>
	<div class="container">
		<div id="content" class="row">
			<div class="col-md-12">
			<!-- content begin-->
			<h2 class="page-header">삭제</h2>
			<form action="delete.do" method="post">
				<div class="form-group">
				<label>삭제하시겠습니까?</label>
				<input type="hidden" name="empno" value="<%=request.getAttribute("empno")%>">
				</div>
				<div class="form-group">
					<button class="btn btn-primary btn-block">확인</button>
					<button type="button" class="btn btn-default btn-block" onclick="history.back();">뒤로</button>
				</div>
			</form>
			<!-- content end-->
			</div>
		</div>
		<div id="footer" class="row">
			<div class="col-md-12">
				<address>
					<p>김해캠퍼스 (50834) 경남 김해시 인제로 197</p>
					<p>Copyright &copy; INJE University. All rights reserved.</p>
				</address>
			</div>
		</div>
	</div>
</body>
</html>
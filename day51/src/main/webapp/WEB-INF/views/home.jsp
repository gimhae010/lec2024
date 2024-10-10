<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.4.1/dist/css/bootstrap.min.css" integrity="sha384-HSMxcRTRxnN+Bdg0JdbxYKrThecOKuH5zCYotlSAcp1+c8xmyTe9GYg1l9a69psu" crossorigin="anonymous">

<!-- Optional theme -->
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.4.1/dist/css/bootstrap-theme.min.css" integrity="sha384-6pzBo3FDv/PJ8r2KRkGHifhEocL+1X2rVCTTkUfGk7/0pbek5mMa1upzvWbrUbOZ" crossorigin="anonymous">
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://code.jquery.com/jquery-1.12.4.min.js" integrity="sha384-nvAa0+6Qg9clwYCGGPpDQLVpLNn0fRaROjHqs13t4Ggj3Ez50XnGQqc/r8MhnRDZ" crossorigin="anonymous"></script>
<!-- Latest compiled and minified JavaScript -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@3.4.1/dist/js/bootstrap.min.js" integrity="sha384-aJ21OjlMXNL5UyIl/XNwTMqvzeRMZH2w8c5cRVpzpU8Y5bApTppSuUkhZXN0VxHd" crossorigin="anonymous"></script>
<script type="text/javascript">
var root='${root}';
$(function(){
	$('nav').find('a').click(e=>{
		let showId=$(e.target).attr('href');
		$('nav+.container>.row').hide();
		$('nav+.container>.row').filter(showId).show();
		$('nav+.container>.row').filter('#footer').show();
		if(showId=='#dept')deptList();
	});	
	$('nav').find('a:eq(0)').click();
});
function deptList(){
	$.getJSON('http://localhost:8080/day51/api/dept/',data=>{	
		$('#dept table tbody')
			.append(
					data.map(ele=>
								$('<tr/>')
								.append('<td>'+ele.deptno+'</td>')
								.append('<td>'+ele.dname+'</td>')
								.append('<td>'+ele.loc+'</td>')
			));
	});
}
</script>
</head>
<body>
<nav class="navbar navbar-default navbar-static-top">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <a class="navbar-brand" href="#index">
        <div>인제대학교</div>
      </a>
    </div>
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
    	<ul class="nav navbar-nav">
    		<li><a href="#index">home</a></li>
    		<li><a href="#intro">intro</a></li>
    		<li><a href="#dept">dept</a></li>
    		<li><a href="#emp">emp</a></li>
    		<li><a href="#login">login</a></li>
    	</ul>
    </div>
  </div>
</nav>

<div class="container">
	<div class="row" id="index">
		<div class="col-md-12">
			<div id="carousel-example-generic" class="carousel slide" data-ride="carousel">
			  <!-- Indicators -->
			  <ol class="carousel-indicators">
			    <li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
			    <li data-target="#carousel-example-generic" data-slide-to="1"></li>
			    <li data-target="#carousel-example-generic" data-slide-to="2"></li>
			  </ol>
			
			  <!-- Wrapper for slides -->
			  <div class="carousel-inner" role="listbox">
			    <div class="item active">
			    	<div class="jumbotron">
					  <h1>Hello, world!</h1>
					</div>
			    </div>
			    <div class="item">
			    	<div class="jumbotron">
					  <h1>Index page!</h1>
					</div>
			    </div>
			    <div class="item">
			    	<div class="jumbotron">
					  <h1>Welcome Site!</h1>
					</div>
			    </div>
			  </div>
			
			  <!-- Controls -->
			  <a class="left carousel-control" href="#carousel-example-generic" role="button" data-slide="prev">
			    <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
			    <span class="sr-only">Previous</span>
			  </a>
			  <a class="right carousel-control" href="#carousel-example-generic" role="button" data-slide="next">
			    <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
			    <span class="sr-only">Next</span>
			  </a>
			</div>
		</div>
	</div>
	<div class="row" id="intro">
		<div class="col-md-12 text-center">
			<img class="img-thumbnail" alt="" src="https://www.inje.ac.kr/kor/assets/images/sub/gimhae-campus-1-241008.jpg">
		</div>
	</div>
	<div class="row" id="dept">
		<div class="col-md-12">
			<h2 class="page-header">dept list page</h2>
			<table class="table">
				<thead>
					<tr>
						<th>deptno</th>
						<th>dname</th>
						<th>loc</th>
					</tr>
				</thead>
				<tbody></tbody>
			</table>
		</div>
	</div>
	<div class="row" id="emp">
		<div class="col-md-12">
			<h2 class="page-header">emp list page</h2>
		
		</div>
	</div>
	<div class="row" id="login">
		<div class="col-md-12">
			<h2 class="page-header">login page</h2>
		
		</div>
	</div>
	<div class="row" id="footer">
		<div class="col-md-12 text-center">
			<address>
				<p>김해캠퍼스 (50834) 경남 김해시 인제로 197</p>
				<p>Copyright &copy; 2024 INJE University. All rights reserved.</p>
			</address>
		</div>
	</div>
</div>
</body>
</html>























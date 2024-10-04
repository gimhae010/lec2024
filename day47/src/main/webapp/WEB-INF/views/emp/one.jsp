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
<h2>상세 & 수정 페이지</h2>
<form action="./${bean.empno}" method="post">
	<input type="hidden" name="_method" value="put">
	<div class="form-group">
		<input class="form-control" name="empno" value="${bean.empno}" readonly="readonly">
	</div>
	<div class="form-group">
		<input class="form-control" name="ename" value="${bean.ename}">
	</div>
	<div class="form-group">
		<input class="form-control" value="${bean.hiredate}">
	</div>
	<div class="form-group">
		<input class="form-control" name="pay" value="${bean.pay}">
	</div>
	<div class="form-group">
		<button>수정</button>
		<button type="button" onclick="del(${bean.empno});">삭제</button>
	</div>
</form>
<script type="text/javascript">
function del(empno){
	/* 
	$.post('${root}/emp/del','empno='+empno,function(data){
		location.href='./';
	}); 
	*/
	$.ajax('${bean.empno}',{
		type :'delete',
		success:function(data){location.href='./';},
		error:function(xhr,msg){alert(msg);}
	});
}
</script>
</body>
</html>




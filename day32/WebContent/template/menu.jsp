<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    String path=request.getParameter("path");
    %>
		<div id="menu" class="row bg-primary">
			<div class="col-md-2"></div>
			<div class="col-md-2 text-center text-uppercase"><a href="<%=path %>/" class="bg-primary">home</a></div>
			<div class="col-md-2 text-center text-uppercase"><a href="<%=path %>/intro.jsp" class="bg-primary">intro</a></div>
			<div class="col-md-2 text-center text-uppercase"><a href="<%=path %>/bbs/list.jsp" class="bg-primary">bbs</a></div>
			<div class="col-md-2 text-center text-uppercase"><a href="<%=path %>/login/" class="bg-primary">login</a></div>
			<div class="col-md-2"></div>
		</div>
		<div id="content">
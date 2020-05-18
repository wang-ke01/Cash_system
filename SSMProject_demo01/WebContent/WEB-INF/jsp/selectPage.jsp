<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>查询会员</title>
<script type="text/javascript">
	var b = ${b};
	if(b==false){
		alert("没有数据！");
	}
	
</script>
<style type="text/css">
	body{
		font-size:16px;
	}
	.box{
		width:100%;
		height:100vh;
		display: flex;
		flex-direction: column;
		align-items: center;
		justify-content: center;
	}
	input[type=text],input[type=password]{
		width:160px;
		height: 26px;
	}
	input[type=submit],button{
		width:70px;
		height: 32px;
	}
	.form-group{
		padding: 2px;
		margin: 18px 0;
		text-align: left;
	}
	label{
		display:inline-block;
		min-width:100px;
		text-align: center;
		vertical-align: top;
		text-align: center;
	}
	h1{
		text-align: center;
	}
	.a{
		width:100%;
		text-align: center;
		margin: 15px 0;
	}
</style>
</head>
<body>
	<div class="box">
	<form action="${pageContext.servletContext.contextPath}/getMemberByNameOrPhoto">
		<h1>会员管理系统</h1>
		<div class="form-group">
			搜索：<input type="text" name="nameorphoto" /></div>
		<div class="form-group" style="text-align: center;">
			<input type="submit" value="查询" />
		</div>
	</form>
		<button onclick="onredirct()">修改</button>
		<div class="a">
			<a href="${pageContext.servletContext.contextPath}/redirct/first">首页</a>
		</div>
	</div>
	<script type="text/javascript">
		function onredirct() {
			window.location.href="${pageContext.servletContext.contextPath}/redirct/update";
		}
	</script>
</body>
</html>
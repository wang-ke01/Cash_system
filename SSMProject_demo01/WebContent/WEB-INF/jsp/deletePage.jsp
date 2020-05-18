<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>删除会员</title>
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
	input[type=submit]{
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
		width:77px;
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
	<form action="${pageContext.servletContext.contextPath}/deleteMember">
		<h1>会员管理系统</h1>
		<div class="form-group">
			<label>查询：</label><input type="text" name="name" />
		</div>
		<div class="form-group" style="text-align: center;">
			<input type="submit" value="删除" />
		</div>
		<div class="a">
			<a href="${pageContext.servletContext.contextPath}/redirct/first">首页</a>
		</div>
	</form>
</div>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>首页</title>
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
	.box a{
		font-size: 24px;
		color:#0000FF;
		text-decoration: none;
	}
	.box a:hover{
		text-decoration: underline;
	}
</style>
</head>
<body>
	<div class='box'>		
		<h1>会员管理系统</h1>
		<a href="${pageContext.servletContext.contextPath}/redirct/add">增加会员</a>
		<a href="${pageContext.servletContext.contextPath}/redirct/delete">删除会员</a>
		<a href="${pageContext.servletContext.contextPath}/redirct/before">修改会员</a>
		<a href="${pageContext.servletContext.contextPath }/redirct/select">查询会员</a>
	</div>
</body>
</html>
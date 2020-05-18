<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>成员信息</title>
<style type="text/css">
	h1{
		text-align: center;
	}
	.box{
		width:100%;
		height:100vh;
		display: flex;
		flex-direction: column;
		align-items: center;
		justify-content: center;
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
		<h1>会员信息表</h1>
		<table border="1">
			<tr>
				<th colspan="9">会员个人信息</th>
			</tr>
			${table }
		</table>
		<div class="a">
			<a href="${pageContext.servletContext.contextPath}/redirct/first">首页</a>
		</div>
	</div>
</body>
</html>
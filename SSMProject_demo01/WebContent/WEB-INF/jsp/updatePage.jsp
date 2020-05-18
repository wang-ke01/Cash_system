<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改会员</title>
<script type="text/javascript">
	var b = ${b}
	if(!b){
		alert("修改失败！");
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
	input[type=submit]{
		width:70px;
		height: 32px;
	}
	.form-group{
		padding: 2px;
		margin: 5px 0;
		text-align: left;
	}
	textarea {
		resize:none;
		width:160px;
		height:72px;
	}
	label{
		display:inline-block;
		width:77px;
		text-align: center;
		vertical-align: top;
		text-align: center;
	}
	.textarea{
		height:77px;
		line-height:77px;
		display: inline-block;
	}
	.sub{
		text-align: center;
	}
	.sex{
		display: inline-block;
		margin: 0 5px;
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
		<form action="${pageContext.servletContext.contextPath}/updateMember" method="post">
		<h1>会员管理系统</h1>
		<input type="hidden" name="id" value="${member.id}" />
		<div class="form-group"><label>姓名：</label><input type="text" name="name" value="${member.name}" /></div>
		<div class="form-group"><label>年龄：</label><input type="text" name="age" value="${member.age}" /></div>
		<div class="form-group"><label>性别：</label><span class="sex">男：</span><input type="radio" name="sex" value="0" <c:if test="${member.sex==0}">checked="checked"</c:if>/>
			<span class="sex">女：</span><input type="radio" name="sex" value="1" <c:if test="${member.sex==1}">checked="checked"</c:if>/></div>
		<div class="form-group"><label>电话：</label><input type="text" name="phone" value="${member.phone}" /></div>
		<div class="form-group"><label>地址：</label><input type="text" name="address" value="${member.address}" /></div>
		<div class="form-group"><label>爱好：</label>跑步：<input type="checkbox" name="hobby" value="1" <c:if test="${fn:contains(member.hobby,'1')}">checked="checked"</c:if> />
			打球：<input type="checkbox" name="hobby" value="2" <c:if test="${fn:contains(member.hobby,'2')}">checked="checked"</c:if> />
			游泳：<input type="checkbox" name="hobby" value="3" <c:if test="${fn:contains(member.hobby,'3')}">checked="checked"</c:if> /></div>
		<div class="form-group"><label>备注：</label><textarea rows="5" cols="10" name="remarks">${member.remarks}</textarea></div>
		<div class="form-group sub"><input type="submit" value="修改" /></div>
		<div class="a">
			<a href="${pageContext.servletContext.contextPath}/redirct/first">首页</a>
		</div>
	</form>
	</div>
</body>
</html>
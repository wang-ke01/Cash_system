<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>首页</title>
<style>
h1 {
	text-align: center;
}
h4 {
	text-align: center;
	height: 100%;
	width: 100%;
}
</style>
</head>
<body>
	<h1>欢迎来到会员管理系统</h1>
	<h4 id="mes"></h4>
	<script type="text/javascript">
		var s = 2;
		function f1(s){
			document.getElementById("mes").innerHTML="请稍等，还有"+s+"秒跳转";
		}
		setInterval(function name(){
			s=s-1;
			f1(s);
			if(s==0){
				clearInterval();
				window.location.href="${pageContext.servletContext.contextPath}/login/first";
			}
		}, 1000);
	</script>
</body>
</html>
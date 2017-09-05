<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>用户登录</title>
</head>
<body>
	<h2 align="center">欢迎来到天迈银行，请您登录</h2>
	<hr>
	<div align="center">
		<form action="UserLoginServlet" method="post">
			<table>
				<tr>
					<td>用户：<input type="text" name="username"></td>
				</tr>
				<tr>
					<td>密码：<input type="password" name="password"></td>
				</tr>
				<tr>
					<td colspan="2"><input type="submit" value="登录"></td>
				</tr>
			</table>
			如果您还没有账号，点击此处<a href="register.jsp">注册</a>
		</form>
	</div>
</body>
</html>
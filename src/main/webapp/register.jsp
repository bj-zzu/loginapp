<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>用户注册</title>
</head>
<body>
	<h2 align="center">欢迎来到天迈银行，请您注册</h2>
	<hr>
	<div align="center">
		<form action="UserRegisterServlet" method="post">
			<table>
				<tr>
					<td>用&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;户：<input
						type="text" name="username"></td>
				</tr>
				<tr>
					<td>密&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;码：<input
						type="password" name="password"></td>
				</tr>
				<tr>
					<td>确认密码：<input type="password" name="password"></td>
				</tr>
				<tr>
					<td colspan="2"><input type="submit" value="提交"></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>
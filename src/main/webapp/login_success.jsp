<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ page import="com.zhm.entity.*,com.zhm.service.UserService,com.zhm.serviceimpl.UserServiceImpl" %>	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>登录成功</title>
</head>
<body>
	<h2 align="center">欢迎来到天迈银行</h2>
	<hr>
	<p align="center">既然来了，送你一个大美女吧</p>
	<div align="center">
		<img width="720" height="640" src="picture/34.jpg">
	</div>
	<div id="delete" align="center">
		 <p>如果你不喜欢我们的网站，就注销掉吧</p>
		<form action="UserDeleteServlet" method="post">
			<table>
	            <tr>
	               <td><input type="submit" value="删除用户"></td>
	            </tr>
			</table>
			
		</form>
	</div>
</body>
</html>
package com.zhm.servlrt;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zhm.entity.User;
import com.zhm.service.UserService;
import com.zhm.serviceimpl.UserServiceImpl;

@WebServlet("/UserDeleteServlet")
public class UserDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		User user=(User)request.getAttribute("user");
		//int id=user.getId();
		UserService userService=new UserServiceImpl();
		if(userService.userDelete(user)){
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}else{
			System.out.println("llllllllllllllll");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doGet(request,response);
	}
}

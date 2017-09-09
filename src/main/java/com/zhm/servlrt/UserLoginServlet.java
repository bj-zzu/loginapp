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

@WebServlet("/UserLoginServlet")
public class UserLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public UserLoginServlet() {
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		User user=new User();
		user.setUsername(username);
		user.setPassword(password);
		UserService userService=new UserServiceImpl();
		if(userService.userLogin(user)){
			request.setAttribute("user", user);
			request.getRequestDispatcher("login_success.jsp").forward(request, response);
		}else{
			request.getRequestDispatcher("login_failure.jsp").forward(request, response);
		}
	}

}

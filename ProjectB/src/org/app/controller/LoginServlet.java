package org.app.controller;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.app.model.User;

import org.app.service.LoginService;
@WebServlet(name = "LoginServlet", urlPatterns = {"/LoginServlet"})
public class LoginServlet extends HttpServlet {
protected void processRequest(HttpServletRequest request, HttpServletResponse response)
		 throws ServletException, IOException {	
	 String UserId = request.getParameter("userId");
	 //String Role = request.getParameter("role");
	 String password = request.getParameter("password");
	 System.out.println("user id "+UserId+"password"+password);
	 
	 LoginService loginService = new LoginService();
	 boolean result = loginService.authenticate(UserId, password);
	 User user =  loginService.getUserByUserId(UserId);
	 if(result == true){
		 request.getSession().setAttribute("user", user);		
		 response.sendRedirect("home.jsp");
	 }
	 else{
		 
		 response.sendRedirect("login.jsp");
	 }
}
@Override
protected void doGet(HttpServletRequest request, HttpServletResponse response)
		 throws ServletException, IOException {
	 processRequest(request, response);
}
@Override
protected void doPost(HttpServletRequest request, HttpServletResponse response)
		 throws ServletException, IOException {
	 processRequest(request, response);
}
@Override
public String getServletInfo() {
	 return "Short description";
}
}

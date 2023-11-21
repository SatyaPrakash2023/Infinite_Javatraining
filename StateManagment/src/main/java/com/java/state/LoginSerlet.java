package com.java.state;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginSerlet
 */
public class LoginSerlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginSerlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String user = request.getParameter("userName");
		String pwd = request.getParameter("passWord");
		String firstName="",lastName="";
		if(user.equals("Jitu")&& pwd.equals("Jitu")) {
			firstName = "Jitendra";
			lastName="Sahoo";
		}
		
		if(user.equals("Satya")&& pwd.equals("Satya")) {
			firstName = "Satya Prakash";
			lastName="Sharma";
		}
		
		if(user.equals("Rahul")&& pwd.equals("Rahul")) {
			firstName = "Rahul Raman";
			lastName="Das";
		}
		
		out.println("<a href='WelcomeServlet?firstName="+firstName+"&lastName="+lastName+"'>Welcome<a/>");
	}

}

package com.java.otp;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class CreateCustomerServlet
 */
public class CreateCustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreateCustomerServlet() {
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
		String pwd,retype;
		pwd = request.getParameter("PassWord");
		retype =  request.getParameter("RePassWord");
		PrintWriter out = response.getWriter();
		if(pwd.equals(retype)) {
			LoginCustomer login = new LoginCustomer();
			login.setCustomerFirstName(request.getParameter("FirstName"));
			login.setCustomerLastName(request.getParameter("LaststName"));
			login.setCustomeruserName(request.getParameter("userName"));
			login.setCustomerPassword(request.getParameter("PassWord"));
			login.setCustomerEmail(request.getParameter("Email"));
			login.setCustomerPhoneNo(request.getParameter("PhoneNumber"));
			login.setCustomerActvationTime(request.getParameter("ActivationTime"));
			
			LoginCustomerDAO dao= new LoginCustomerDaoImpl();
			try {
				out.println(dao.CreateUser(login));
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}else {
			out.println("Password and retype password must be same..");
		}
	}
	

}

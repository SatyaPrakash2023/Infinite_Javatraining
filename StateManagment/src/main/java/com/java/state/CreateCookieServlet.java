package com.java.state;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import jakarta.ws.rs.core.Cookie;

/**
 * Servlet implementation class CreateCookieServlet
 */
public class CreateCookieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreateCookieServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Cookie ckJitendra =  new Cookie("Jitendra","87");
		ckJitendra.setMaxAge(1000*60*60*24);
		response.addCookie(ckJitendra);
		
		
		Cookie ckRahul =  new Cookie("Rahul","85");
		ckRahul.setMaxAge(1000*60*60*23);
		response.addCookie(ckRahul);
		
		
		Cookie ckSourav =  new Cookie("Sourav","89");
		ckSourav.setMaxAge(1000*60*60*24);
		response.addCookie(ckSourav);
		Cookie ckSatya =  new Cookie("Sourav","89");
		ckSatya.setMaxAge(1000*60*60*24);
		response.addCookie(ckSatya);
		
		PrintWriter out = response.getWriter();
		out.println("Cookies are created...");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

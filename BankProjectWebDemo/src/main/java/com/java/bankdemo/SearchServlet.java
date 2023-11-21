package com.java.bankdemo;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class SearchServlet
 */
public class SearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public SearchServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int accountNo = Integer.parseInt(request.getParameter("accountNo"));
		BankDAO dao = new BankDaoImpl();
		PrintWriter out = response.getWriter();
		
		try {
			Bank b = dao.searchDAO(accountNo);
			if(b!=null) {
				out.println("Account Number"+ b.getAccountNo());
				out.println("First Name "+b.getFirstName());
				out.println("Last Name "+b.getLastName());
				out.println("City Name "+b.getCity());
				out.println("State Name "+b.getState());
				out.println("Amount is "+b.getAmount());
				out.println("Cheq Facil "+b.getCheqFacil());
				out.println("Account Type "+b.getAccountType());
				out.println("Status "+b.getStatus());
				out.println("Date of open "+b.getDateOfopen());
				
			}else {
				out.println("***Account number is not there****");
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

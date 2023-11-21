package com.java.bankdemo;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CreateBankAccountServlet
 */
public class CreateBankAccountServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreateBankAccountServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Bank b1 = new Bank();
		b1.setAccountNo(Integer.parseInt(request.getParameter("accountNumber")));
		b1.setFirstName(request.getParameter("firstName"));
		b1.setLastName(request.getParameter("lastName"));
		b1.setCity(request.getParameter("city"));
		b1.setState(request.getParameter("State"));
		b1.setAmount(Integer.parseInt(request.getParameter("amount")));
		b1.setCheqFacil(request.getParameter("ChecqFacil"));
		b1.setAccountType(request.getParameter("AccountType"));
		b1.setStatus(request.getParameter("Status"));
		
		PrintWriter out= response.getWriter();
		BankDAO dao = new BankDaoImpl();
		
		try {
			out.println(dao.createAccountDao(b1));
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

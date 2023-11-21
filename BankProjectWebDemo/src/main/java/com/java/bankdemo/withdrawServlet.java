package com.java.bankdemo;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class withdrawServlet
 */
public class withdrawServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /*
     * @see HttpServlet#HttpServlet()
     */
    public withdrawServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Bank obj = new Bank();
		obj.setAccountNo(Integer.parseInt(request.getParameter("accountNumber")));
		obj.setAmount(Integer.parseInt(request.getParameter("amount")));
		PrintWriter out =response.getWriter();
		BankDAO dao = new BankDaoImpl();
		
		try {
			dao.withdrawAccountDao(obj.getAccountNo(), obj.getAmount());
			out.println("Amount Debited from your account"+obj.getAmount() );
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

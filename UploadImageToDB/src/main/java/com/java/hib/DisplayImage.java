package com.java.hib;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DisplayImage
 */
public class DisplayImage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DisplayImage() {
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
		// TODO Auto-generated method stub
//		doGet(request, response);
		String imageId=request.getParameter("imageId");
//		System.out.println("Hello inside display servlet..");
		int id=Integer.parseInt(imageId);
		
		
		Connection connection=null;
		int ImgId=0;
		String imageFileName=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/aerolines","root","Satya");
			Statement pst;
			String query="Select * from images";
			pst=connection.createStatement();
			ResultSet rs=pst.executeQuery(query);
			while(rs.next()) {
				if(rs.getInt("ImageId") == id) {
					ImgId=rs.getInt("ImageId");
					imageFileName=rs.getString("ImageName");
				}
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		RequestDispatcher rd;
		request.setAttribute("Id", String.valueOf(ImgId));
		request.setAttribute("imgFileName", imageFileName);
		rd=request.getRequestDispatcher("displayImages.jsp");
		rd.forward(request, response);
	}

}

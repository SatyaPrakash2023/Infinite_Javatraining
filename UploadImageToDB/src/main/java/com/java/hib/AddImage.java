package com.java.hib;

import java.io.FileOutputStream; 
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 * Servlet implementation class AddImage
 */

@MultipartConfig
public class AddImage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddImage() {
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
		Part file=request.getPart("image");
		String ImgfileName=file.getSubmittedFileName();
		String uploadPath="D:/Bike_Rental_System/UploadImageToDB/src/main/webapp/Images"+ImgfileName;
		System.out.println("Upload path is: "+uploadPath);
		try {
			FileOutputStream fos=new FileOutputStream(uploadPath);
			InputStream is=file.getInputStream();
			byte[] data=new byte[is.available()];
			is.read(data);
			fos.write(data);
			fos.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("Seleceted file name is: "+ImgfileName);
		System.out.println("Hii Satya i am inside servlet method..");
		
		Connection connection=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/aerolines","root","Satya");
			PreparedStatement pst;
			String query="insert into Images(ImageName) values(?)";
			pst=connection.prepareStatement(query);
			pst.setString(1, ImgfileName);
			int row=pst.executeUpdate();
			System.out.println("row is "+row);
			if(row>0) {
				System.out.println("Images addes in database sucessfully....");
			}else {
				System.out.println("Failed to upload images...");
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		RequestDispatcher rd;
		rd=request.getRequestDispatcher("displayImages.jsp");
		rd.forward(request, response);
		
	}

}

package com.java.library;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LibraryDaoImpl implements LibraryDAO {
	Connection connection;
	PreparedStatement pst;

	@Override
	public String createUser(LibUsers libusers) throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String encPwd = EncryptPassWord.getCode(libusers.getPassWord());
		String cmd = "Insert into LibUsers(UserName,PassWord) values(?,?)";
		pst = connection.prepareStatement(cmd);
		pst.setString(1, libusers.getUserName());
		pst.setString(2, encPwd);
		pst.executeUpdate();
		return "User Created....";
	}

	@Override
	public int authenticate(LibUsers libUsers) throws SQLException, ClassNotFoundException {
		connection = ConnectionHelper.getConnection();
		String encr = EncryptPassWord.getCode(libUsers.getPassWord());
		String cmd = "select count(*) cnt from LibUsers where userName=? AND Password=?";
		pst = connection.prepareStatement(cmd);
		pst.setString(1, libUsers.getUserName());
		pst.setString(2, encr.trim());
		ResultSet rs = pst.executeQuery();
		rs.next();
		int count = rs.getInt("cnt");
		return count;

	}

	public Books searchType(int id) throws ClassNotFoundException, SQLException {

		connection = ConnectionHelper.getConnection();

		String cmd = "Select * from books where id = ?";

		pst = connection.prepareStatement(cmd);

		pst.setInt(1, id);

		ResultSet rs = pst.executeQuery();

		Books book = null;

		List<Books> bookList = new ArrayList<Books>();

		if (rs.next()) {

			book = new Books();

			book.setId(rs.getInt("id"));

			book.setName(rs.getString("name"));

			book.setAuthor(rs.getString("author"));

			book.setDept(rs.getString("dept"));

			book.setNoOfBooks(rs.getInt("noOfbook"));

			bookList.add(book);

		}

		return book;

	}

	@Override

	public String updateBooks(Books book) throws ClassNotFoundException, SQLException {

		Books bookFound = searchType(book.getId());

		Books noOfBook = searchType(book.getNoOfBooks());

		if (bookFound != null && noOfBook != null) {

			connection = ConnectionHelper.getConnection();

			String cmd = "Update books set totalBooks = ? where id = ?";

			pst = connection.prepareStatement(cmd);

			pst.setInt(1, book.getNoOfBooks() - 1);

			pst.setInt(2, book.getId());

			pst.executeUpdate();

			return "Updated";

		}

		return "Not found";

	}

	@Override
	public List<Books> searchBooks(String searchType, String searchValue) throws ClassNotFoundException, SQLException {
		String sql;
		boolean isValid = true;
		if (searchType.equals("id")) {
			sql = "Select*from Books WHERE id=?";
		} else if (searchType.equals("bookName")) {
			sql = "SELECT * FROM Books WHERE Name = ?";
		} else if (searchType.equals("authorname")) {
			sql = "select * from Books Where Author=?";
		} else if (searchType.equals("dept")) {
			sql = "select * from Books Where Dept=?";
		} else {
			isValid = false;
			sql = "SELECT * FROM Books";
		}
		connection = ConnectionHelper.getConnection();
		pst = connection.prepareStatement(sql);
		if (isValid == true) {
			pst.setString(1, searchValue);
		}
		ResultSet rs = pst.executeQuery();
		Books books = null;
		List<Books> booksList = new ArrayList<Books>();
		while (rs.next()) {
			books = new Books();
			books.setId(rs.getInt("id"));
			books.setName(rs.getString("name"));
			books.setAuthor(rs.getString("author"));
			books.setEdition(rs.getString("edition"));
			books.setDept(rs.getString("dept"));
			books.setNoOfBooks(rs.getInt("TotalBooks"));
			booksList.add(books);
		}
		return booksList;
	}
	
	
	public int issueOrNot(String userName, int bookId) throws ClassNotFoundException, SQLException {
		Connection connection = ConnectionHelper.getConnection();
		String cmd = "select count(*) cnt from TranBook where Username=? and BookId=?";
		PreparedStatement pst = connection.prepareStatement(cmd);
		pst.setString(1, userName);
		pst.setInt(2, bookId);
		ResultSet rs = pst.executeQuery();
		rs.next();
		int count =rs.getInt("cnt");
		return count;
	}

	
	public String issueBook(String userName, int bookId) throws ClassNotFoundException, SQLException 
	{
			Connection connection = ConnectionHelper.getConnection();
			String sql = "Insert into tranBook(Username,BookId) values(?,?)";
			PreparedStatement pst = connection.prepareStatement(sql);
			pst.setString(1, userName);
			pst.setInt(2, bookId);
			pst.executeUpdate();
			sql="Update books set TotalBooks=TotalBooks-1 where id=?";
			pst = connection.prepareStatement(sql);
			pst.setInt(1, bookId);
			pst.executeUpdate();
			return "Book with Id " +bookId + " Issued Successfully...";
		
	}

	@Override
	public List<Tranbook> showHistory(String user) throws ClassNotFoundException, SQLException {
		connection=ConnectionHelper.getConnection();
		String cmd="select * from tranbook where Username=?";
		pst=connection.prepareStatement(cmd);
		pst.setString(1, user);
		ResultSet rs=pst.executeQuery();
		
		List<Tranbook> bookList1= new ArrayList<Tranbook>();
		Tranbook book=null;
		while(rs.next()) {
			book=new Tranbook();
			book.setUsername(rs.getString("Username"));
			book.setBookId(rs.getInt("BookId"));
			book.setFromdate(rs.getDate("FromDate"));
			bookList1.add(book);
		}
		return bookList1;
	}
	
	
	@Override
	public List<Tranbook> showreturn(String user) throws ClassNotFoundException, SQLException {
		connection=ConnectionHelper.getConnection();
		String cmd="select * from tranbook where Username=?";
		pst=connection.prepareStatement(cmd);
		pst.setString(1, user);
		ResultSet rs=pst.executeQuery();
		
		List<Tranbook> bookList1= new ArrayList<Tranbook>();
		Tranbook book=null;
		while(rs.next()) {
			book=new Tranbook();
			book.setUsername(rs.getString("Username"));
			book.setBookId(rs.getInt("BookId"));
			book.setFromdate(rs.getDate("FromDate"));
			bookList1.add(book);
		}
		return bookList1;
	}

	

	@Override
	public String returnBook(int id) throws ClassNotFoundException, SQLException {
		Date date=new Date();
		connection=ConnectionHelper.getConnection();
		String cmd="Insert Into transreturn(Username,BookId,Fromdate) select Username,BookId,FromDate from tranbook where BookId=?";
		pst=connection.prepareStatement(cmd);
		pst.setInt(1, id);
		pst.executeUpdate();
		
		cmd="Update books set totalBooks=totalBooks+1 where BookId=?";
		pst=connection.prepareStatement(cmd);
		pst.setInt(1, id);
		pst.executeUpdate();
		
		
		cmd="Delete from tranbook where BookId=?";
		pst=connection.prepareStatement(cmd);
		pst.setInt(1, id);
		pst.executeUpdate();
		
		return"Book Return and Updated in transreturn table...";
	}

	

}

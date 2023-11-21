package com.java.library;

import java.sql.SQLException;
import java.util.List;

public interface LibraryDAO {
	String createUser(LibUsers libusers) throws ClassNotFoundException, SQLException;
	int authenticate(LibUsers libUsers) throws SQLException, ClassNotFoundException;
	List<Books> searchBooks(String searchType, String searchValue) throws ClassNotFoundException, SQLException;
	String updateBooks(Books book)throws ClassNotFoundException, SQLException;
	Books searchType(int id) throws ClassNotFoundException, SQLException;
	String  issueBook(String user,int id)throws ClassNotFoundException, SQLException;
	int issueOrNot(String userName,int id) throws ClassNotFoundException, SQLException;
	List<Tranbook>showHistory(String user) throws ClassNotFoundException, SQLException;
	
	List<Tranbook>showreturn(String user) throws ClassNotFoundException, SQLException;
	String  returnBook(int id)throws ClassNotFoundException, SQLException;
	

}

package com.java.library;

import java.sql.Date;

public class Transreturn {
	private String Username;
	private int BookId;
	private Date Fromdate;
	private Date Todate;
	public Transreturn() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Transreturn(String username, int bookId, Date fromdate, Date todate) {
		super();
		Username = username;
		BookId = bookId;
		Fromdate = fromdate;
		Todate = todate;
	}
	
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public int getBookId() {
		return BookId;
	}
	public void setBookId(int bookId) {
		BookId = bookId;
	}
	public Date getFromdate() {
		return Fromdate;
	}
	public void setFromdate(Date fromdate) {
		Fromdate = fromdate;
	}
	public Date getTodate() {
		return Todate;
	}
	public void setTodate(Date todate) {
		Todate = todate;
	}
	@Override
	public String toString() {
		return "Transreturn [Username=" + Username + ", BookId=" + BookId + ", Fromdate=" + Fromdate + ", Todate="
				+ Todate + "]";
	}
	
	
	

}

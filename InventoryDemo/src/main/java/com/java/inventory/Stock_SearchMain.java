package com.java.inventory;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class Stock_SearchMain {
	public static void main(String[] args) {
		String stockId;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Stock Id..");
		stockId=sc.next();
		Inventory_StockDAO dao= new Inventory_StockDaoImpl();
		try {
			Inventory_Stock stock=dao.Search_Stock(stockId);
			if (stock!=null) {
				System.out.println(stock);
			} else {
				System.out.println("*** Record Not Found ***");
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}

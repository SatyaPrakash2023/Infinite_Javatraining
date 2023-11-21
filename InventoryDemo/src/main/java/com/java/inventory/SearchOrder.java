package com.java.inventory;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class SearchOrder {
	public static void main(String[] args) {
		int OrderId;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Order Id..");
		OrderId=sc.nextInt();
		OrderDAO dao= new OrderDaoImpl();
		try {
			Inventory_Order order=dao.SearchOrder(OrderId);
			if (order!=null) {
				System.out.println(order);
			} else {
				System.out.println("*** Record Not Found ***");
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}

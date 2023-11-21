package com.java.inventory;

import java.sql.SQLException;
import java.util.Scanner;

public class AddOrderMain {
	
	public static void main(String[] args) {
		
		Inventory_Order order=new Inventory_Order();
		 int OrderId;
		 int QtyOrd;
		 String StockId;
		 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Order Id.. ");
		OrderId=sc.nextInt();
		order.setOrderId(OrderId);
		System.out.println("Enter Stock Id");
		StockId=sc.next();
		order.setStockId(StockId);
		System.out.println("Enter Quantity Order..");
		QtyOrd=sc.nextInt();
		order.setQtyOrd(QtyOrd);
		
		OrderDAO dao= new OrderDaoImpl();
		
		try {
			System.out.println(dao.AddOrder(order));
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	

}


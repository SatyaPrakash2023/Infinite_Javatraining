package com.java.inventory;

import java.sql.SQLException;
import java.util.Scanner;

public class Inventory_StockMain {
	
	public static void main(String[] args) {
		
		Inventory_Stock inv_s=new Inventory_Stock();
		String ItemName;
		double price;
		int QtyAvail;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Item Name.. ");
		ItemName=sc.next();
		inv_s.setItemName(ItemName);
		System.out.println("Enter price..");
		price=sc.nextDouble();
		inv_s.setPrice(price);
		System.out.println("Enter Quantity Available");
		QtyAvail=sc.nextInt();
		inv_s.setQtyAvail(QtyAvail);
		Inventory_StockDAO dao= new Inventory_StockDaoImpl();
		
		try {
			System.out.println(dao.AddStock(inv_s));
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	

}

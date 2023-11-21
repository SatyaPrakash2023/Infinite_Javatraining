package com.java.inventory;

import java.sql.SQLException;
import java.util.List;

public class OrderShowMain {
	
	public static void main(String[] args) {
		OrderDAO dao= new OrderDaoImpl();
		
		try {
			List<Inventory_Order> invotory_List = dao.showOrder();
			for (Inventory_Order inventory_Order : invotory_List) {
				System.out.println(inventory_Order);
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

package com.java.inventory;

import java.sql.SQLException;
import java.util.List;

public class Inv_StockShowMain {
	
	public static void main(String[] args) {
		Inventory_StockDAO dao= new Inventory_StockDaoImpl();
		
		try {
			List<Inventory_Stock> invotory_List = dao.showStack();
			for (Inventory_Stock inventory_Stock : invotory_List) {
				System.out.println(inventory_Stock);
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

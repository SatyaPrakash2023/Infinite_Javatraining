package com.java.inventory;

import java.sql.SQLException;
import java.util.List;

public interface Inventory_StockDAO {
	String AddStock(Inventory_Stock inventory) throws ClassNotFoundException, SQLException;
	List<Inventory_Stock>showStack() throws ClassNotFoundException, SQLException;
	Inventory_Stock Search_Stock(String stockId)throws ClassNotFoundException, SQLException;
	
	

}

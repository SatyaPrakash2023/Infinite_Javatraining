package com.java.inventory;

import java.sql.SQLException;
import java.util.List;

public interface OrderDAO {
	String AddOrder(Inventory_Order inventory)throws ClassNotFoundException, SQLException ;
	List<Inventory_Order>showOrder() throws ClassNotFoundException, SQLException;
	Inventory_Order SearchOrder(int orderId) throws ClassNotFoundException, SQLException;
	

}

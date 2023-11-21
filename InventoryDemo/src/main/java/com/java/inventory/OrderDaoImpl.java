package com.java.inventory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class OrderDaoImpl implements OrderDAO {
	
	Connection connection;
	PreparedStatement pst;
	
	
	
	
public String AddOrder(Inventory_Order inventory) throws ClassNotFoundException, SQLException {
	
//	Inventory_Order invorder= SearchOrder(inventory.getOrderId());
//	String StockId = invorder.getStockId();
	
	Inventory_StockDAO dao= new Inventory_StockDaoImpl();
	Inventory_Stock invFound = dao.Search_Stock(inventory.getStockId() );
	int available=invFound.getQtyAvail();
	double price=invFound.getPrice();
	
	if(inventory.getQtyOrd()<=available) {
		
		
		connection = InventoryConnectionHelper.getConnection();
		String cmd = "Insert Into orders(OrderId,StockID,QtyOrd) values(?,?,?)";
		pst=connection.prepareStatement(cmd);
		
		pst.setInt(1, inventory.getOrderId());
		pst.setString(2, inventory.getStockId());
		pst.setInt(3, inventory.getQtyOrd());
		
		pst.executeUpdate();
		
		cmd = "Update orders set billAmount = QtyOrd * ? Where OrderId=?";
		pst=connection.prepareStatement(cmd);
		pst.setDouble(1, price);
		pst.setInt(2, inventory.getOrderId());
		pst.executeUpdate();
		
		cmd="Update stock set QuantityAvail=QuantityAvail-? where StockId=?";
		pst=connection.prepareStatement(cmd);
		pst.setInt(1, inventory.getQtyOrd());
		pst.setString(2, inventory.getStockId());
		pst.executeUpdate();
		
		
		
		return"Order is added..";
	  }
	
	return"";
	}



	@Override
	public List<Inventory_Order> showOrder() throws ClassNotFoundException, SQLException {
		connection=InventoryConnectionHelper.getConnection();
		String cmd = "select * from orders";
		pst=connection.prepareStatement(cmd);
		ResultSet rs = pst.executeQuery();
		Inventory_Order inv_order=null;
		List<Inventory_Order> inv_list= new ArrayList<Inventory_Order>();
		while(rs.next()) {
			inv_order=new Inventory_Order();
			inv_order.setOrderId(rs.getInt("OrderId"));
			inv_order.setStockId(rs.getString("StockID"));
			inv_order.setQtyOrd(rs.getInt("QtyOrd"));
			inv_order.setBillAmount(rs.getDouble("billAmount"));
			inv_list.add(inv_order);
		}
		return inv_list;
	}



	
	public Inventory_Order SearchOrder(int OrderId) throws ClassNotFoundException, SQLException {
		connection=InventoryConnectionHelper.getConnection();
		String cmd = "select * from orders where OrderId=?";
		pst=connection.prepareStatement(cmd);
		pst.setInt(1, OrderId);
		ResultSet rs = pst.executeQuery();
		Inventory_Order inv_order=null;
		
		while(rs.next()) {
			inv_order=new Inventory_Order();
			inv_order.setOrderId(rs.getInt("OrderId"));
			inv_order.setStockId(rs.getString("StockID"));
			inv_order.setQtyOrd(rs.getInt("QtyOrd"));
			inv_order.setBillAmount(rs.getDouble("billAmount"));
			
			
		}
		return inv_order;
	}



	



	


}

package com.java.inventory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Inventory_StockDaoImpl implements Inventory_StockDAO {
	
		Connection connection;
		PreparedStatement pst;
		static int x=4;
	public String increment() {
		 
		String stock_id="S00"+x;
		x++;
		return stock_id;
	}	
	

	
	public String AddStock(Inventory_Stock inventory) throws ClassNotFoundException, SQLException {
		
		connection = InventoryConnectionHelper.getConnection();
		String cmd = "Insert Into stock(stockid,ItemName,Price,QuantityAvail) values(?,?,?,?)";
		pst=connection.prepareStatement(cmd);
		String id = increment();
		pst.setString(1, id);
		pst.setString(2, inventory.getItemName());
		pst.setDouble(3, inventory.getPrice());
		pst.setInt(4, inventory.getQtyAvail());
		pst.executeUpdate();
		return"Stock is added..";
		
	}



	@Override
	public List<Inventory_Stock> showStack() throws ClassNotFoundException, SQLException {
		connection=InventoryConnectionHelper.getConnection();
		String cmd = "select * from stock";
		pst=connection.prepareStatement(cmd);
		ResultSet rs = pst.executeQuery();
		Inventory_Stock inv_stock=null;
		List<Inventory_Stock> inv_list= new ArrayList<Inventory_Stock>();
		while(rs.next()) {
			inv_stock=new Inventory_Stock();
			inv_stock.setStockId(rs.getString("stockid"));
			inv_stock.setItemName(rs.getString("ItemName"));
			inv_stock.setPrice(rs.getDouble("price"));
			inv_stock.setQtyAvail(rs.getInt("QuantityAvail"));
			inv_list.add(inv_stock);
		}
		return inv_list;
	}



	
	public Inventory_Stock Search_Stock(String stockId) throws ClassNotFoundException, SQLException {
		connection=InventoryConnectionHelper.getConnection();
		String cmd = "select * from stock where stockid=?";
		pst=connection.prepareStatement(cmd);
		pst.setString(1, stockId);
		ResultSet rs = pst.executeQuery();
		Inventory_Stock inv_stock=null;
		
		while(rs.next()) {
			inv_stock=new Inventory_Stock();
			inv_stock.setStockId(rs.getString("stockid"));
			inv_stock.setItemName(rs.getString("ItemName"));
			inv_stock.setPrice(rs.getDouble("price"));
			inv_stock.setQtyAvail(rs.getInt("QuantityAvail"));
			
		}
		return inv_stock;
	}

}

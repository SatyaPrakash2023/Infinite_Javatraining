package com.java.inventory;

public class Inventory_Stock {
	
	private String StockId;
	
	private String ItemName;
	private double price;
	private int QtyAvail;
	
	
	
	
	public Inventory_Stock() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Inventory_Stock(String stockId, String itemName, double price, int qtyAvail) {
		super();
		StockId = stockId;
		ItemName = itemName;
		this.price = price;
		QtyAvail = qtyAvail;
	}



	public String getStockId() {
		return StockId;
	}
	public void setStockId(String stockId) {
		StockId = stockId;
	}
	public String getItemName() {
		return ItemName;
	}
	public void setItemName(String itemName) {
		ItemName = itemName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQtyAvail() {
		return QtyAvail;
	}
	public void setQtyAvail(int qtyAvail) {
		QtyAvail = qtyAvail;
	}
	@Override
	public String toString() {
		return "Inventory [StockId=" + StockId + ", ItemName=" + ItemName + ", price=" + price + ", QtyAvail="
				+ QtyAvail + "]";
	}
	
	
	

}

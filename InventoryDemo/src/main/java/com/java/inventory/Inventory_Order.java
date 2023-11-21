package com.java.inventory;

public class Inventory_Order {
	
	private int OrderId;
	private int QtyOrd;
	private String StockId;
	private double billAmount;
	public Inventory_Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Inventory_Order(int orderId, int qtyOrd, String stockId, double billAmount) {
		super();
		OrderId = orderId;
		QtyOrd = qtyOrd;
		StockId = stockId;
		this.billAmount = billAmount;
	}
	public int getOrderId() {
		return OrderId;
	}
	public void setOrderId(int orderId) {
		OrderId = orderId;
	}
	public int getQtyOrd() {
		return QtyOrd;
	}
	public void setQtyOrd(int d) {
		QtyOrd = d;
	}
	public String getStockId() {
		return StockId;
	}
	public void setStockId(String stockId) {
		StockId = stockId;
	}
	public double getBillAmount() {
		return billAmount;
	}
	public void setBillAmount(double billAmount) {
		this.billAmount = billAmount;
	}
	@Override
	public String toString() {
		return "Inventory_Order [OrderId=" + OrderId + ", QtyOrd=" + QtyOrd + ", StockId=" + StockId + ", billAmount="
				+ billAmount + "]";
	}
	
	

}

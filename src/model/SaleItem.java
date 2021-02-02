package model;

public class SaleItem {

	private final String name;
	private final double price;
	private final int quantity;

	public SaleItem(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public int getQuantity() {
		return quantity;
	}
	
	
}

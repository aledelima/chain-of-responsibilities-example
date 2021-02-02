package model;
import java.util.ArrayList;
import java.util.List;

public class Sale {

	private List<SaleItem> itens = new ArrayList<>();
	
	public void addItem(SaleItem item) {
		this.itens.add(item);
	}
	
	public double getAverageSale() {
		return getTotal()/getTotalQuantity();
	}
	
	public int getTotalQuantity() {
		return this.itens.stream()
				.mapToInt(i -> i.getQuantity())
				.sum();
	}
	
	public double getTotal() {
		return this.itens.stream()
				.mapToDouble(i -> i.getPrice()*i.getQuantity())
				.sum();
	}
	
}

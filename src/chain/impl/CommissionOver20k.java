package chain.impl;

import chain.interfaces.Commission;
import model.Sale;

public class CommissionOver20k implements Commission {

	private Commission next;
	
	@Override
	public double calculate(Sale sale) {
		if (20000.0 <= sale.getTotal()) {
			double commission = sale.getTotal() * 0.1 + 1000.0; //10% + 1k
			if (sale.getAverageSale() > 1500.0) 
				commission += sale.getTotalQuantity()*100; //100 per unit
//			System.out.println("Over 20k");
			return commission;
		} else {
			return this.next.calculate(sale);
		}
	} 

	@Override
	public void setNext(Commission next) {
		this.next = next;
	}

}

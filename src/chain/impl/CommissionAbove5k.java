package chain.impl;

import chain.interfaces.Commission;
import model.Sale;

public class CommissionAbove5k implements Commission {

	private Commission next;
	
	@Override
	public double calculate(Sale sale) {
		if (sale.getTotal() < 5000.0) {
//			System.out.println("Less than 5k");
			return 100.0;
		} else {
			return this.next.calculate(sale);
		}	
	} 

	@Override
	public void setNext(Commission next) {
		this.next = next;
	}

}

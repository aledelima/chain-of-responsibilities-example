package chain.impl;

import chain.interfaces.Commission;
import model.Sale;

public class CommissionBetween10kAnd20k implements Commission {

	private Commission next;
	
	@Override
	public double calculate(Sale sale) {
		if (10000.0 <= sale.getTotal() && sale.getTotal() <20000.0) {
			double commission = sale.getTotal() * 0.07 + 500.0; //7% plus 500
			if (sale.getAverageSale() > 1000.0) 
				commission *= 1.1; //10% over
//			System.out.println("Between 10k and 20k");
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

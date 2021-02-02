package chain.impl;

import chain.interfaces.Commission;
import model.Sale;

public class CommissionBetween5kAnd10k implements Commission {

	private Commission next;
	
	@Override
	public double calculate(Sale sale) {
		if (5000.0 <= sale.getTotal() && sale.getTotal() < 10000.0) {
			double commission = sale.getTotal() * 0.05; //5% more
			if (sale.getAverageSale() > 500.0) 
				commission = sale.getTotal() * 0.06; //5% plus 1%
//			System.out.println("Between 5k and 10k");
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

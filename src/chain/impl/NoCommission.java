package chain.impl;

import chain.interfaces.Commission;
import model.Sale;

public class NoCommission implements Commission {
	
	@Override
	public double calculate(Sale sale) {
		return 0.0;
	} 

	@Override
	public void setNext(Commission next) {
		// No content
	}

}

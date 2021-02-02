package chain.interfaces;

import model.Sale;

public interface Commission {

	public double calculate(Sale sale);
	public void setNext(Commission next);
	
}

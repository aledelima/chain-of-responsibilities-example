package chain;

import chain.impl.CommissionAbove5k;
import chain.impl.CommissionBetween10kAnd20k;
import chain.impl.CommissionBetween5kAnd10k;
import chain.impl.CommissionOver20k;
import chain.impl.NoCommission;
import chain.interfaces.Commission;
import model.Sale;

/**
 * Implements a design pattern of a Chain of Responsibility for
 * commission calculation according to values of a Sale and its
 * items.
 * 
 * @author aledelima
 *
 */
public class CommissionCalculator {

	public double calculates(Sale sale) {
		//Classes in the chain
		Commission above5k = new CommissionAbove5k();
		Commission between5kAnd10k = new CommissionBetween5kAnd10k();
		Commission between10kAnd20k = new CommissionBetween10kAnd20k();
		Commission over20k = new CommissionOver20k();
		Commission noCommission = new NoCommission();
		
		//Assemblies chain order
		above5k.setNext(between5kAnd10k);
		between5kAnd10k.setNext(between10kAnd20k);
		between10kAnd20k.setNext(over20k);
		over20k.setNext(noCommission);
		
		//Starts the chain
		return above5k.calculate(sale);
	}
	
}

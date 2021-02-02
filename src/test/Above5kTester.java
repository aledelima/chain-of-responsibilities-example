package test;

import org.junit.Assert;
import org.junit.Test;

import chain.CommissionCalculator;
import model.Sale;
import model.SaleItem;

public class Above5kTester {

	@Test
	public void checkComission() {
		
		//Creates sale items
		SaleItem i1 = new SaleItem("PC Computer", 3000.0, 1);
		SaleItem i2 = new SaleItem("Nobreak", 800., 1);
		
		//Add sale items to sale
		Sale sale = new Sale();
		sale.addItem(i1);
		sale.addItem(i2);
		
		//Object calculator with a chain of responsibilities
		CommissionCalculator calculator = new CommissionCalculator();
		
		//Unit test
		Assert.assertEquals(100.0, calculator.calculates(sale), 0.00001);
	}
	
}

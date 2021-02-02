package test;

import org.junit.Assert;
import org.junit.Test;

import chain.CommissionCalculator;
import model.Sale;
import model.SaleItem;

public class Over20kTester {

	@Test
	public void checkComission() {
		
		//For averageSale <= 1500
		
		//Creates sale items
		SaleItem i1 = new SaleItem("Printer Bematech", 1200.0, 20);
		
		//Add sale items to sale
		Sale sale1 = new Sale();
		sale1.addItem(i1);
		
		//Object calculator with a chain of responsibilities
		CommissionCalculator calculator = new CommissionCalculator();
		
		//Unit test
		Assert.assertEquals(3400.0, calculator.calculates(sale1), 0.00001);
		
		
		//For averageSale > 1500
		SaleItem i2 = new SaleItem("Printer HP", 2000.0, 10);
		Sale sale2 = new Sale();
		sale2.addItem(i2);
		
		Assert.assertEquals(4000.0, calculator.calculates(sale2), 0.00001);
		
	}
	
}

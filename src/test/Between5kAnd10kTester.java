package test;

import org.junit.Assert;
import org.junit.Test;

import chain.CommissionCalculator;
import model.Sale;
import model.SaleItem;

public class Between5kAnd10kTester {

	@Test
	public void checkComission() {
		
		//For averageSale >= 500
		
		//Creates sale items
		SaleItem i1 = new SaleItem("PC Computer", 3000.0, 1);
		SaleItem i2 = new SaleItem("Nobreak", 800.0, 1);
		SaleItem i3 = new SaleItem("Macintosh", 5000.0, 1);
		
		//Add sale items to sale
		Sale sale1 = new Sale();
		sale1.addItem(i1);
		sale1.addItem(i2);
		sale1.addItem(i3);
		
		//Object calculator with a chain of responsibilities
		CommissionCalculator calculator = new CommissionCalculator();
		
		//Unit test
		Assert.assertEquals(528.0, calculator.calculates(sale1), 0.00001);
		
		
		//For averageSale < 500
		
		SaleItem i = new SaleItem("Raspberry Pi", 450.0, 12);
		Sale sale2 = new Sale();
		sale2.addItem(i);
		
		
		Assert.assertEquals(270.0, calculator.calculates(sale2), 0.00001);
		
	}
	
}

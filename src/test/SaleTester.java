package test;

import org.junit.Assert;
import org.junit.Test;

import model.Sale;
import model.SaleItem;

public class SaleTester {

	@Test
	public void getMethods() {
		//Sale Itens
		SaleItem i1 = new SaleItem("Pen", 1.5, 3);
		SaleItem i2 = new SaleItem("Notebook", 5.0, 1);
		SaleItem i3 = new SaleItem("Backpack", 55.0, 1);
		
		//Add itens to sale
		Sale sale = new Sale();
		sale.addItem(i1);
		sale.addItem(i2);
		sale.addItem(i3);
		
		//Test output values
		Assert.assertEquals(sale.getTotal(), 61.5, 0.0001);
		Assert.assertEquals(sale.getTotalQuantity(), 5.0, 0.0001);
		Assert.assertEquals(sale.getAverageSale(), 12.3, 0.0001);
	}
	
}

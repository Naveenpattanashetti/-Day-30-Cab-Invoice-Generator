package com.bridgelabz.Cab_Invoice_Generator;

import junit.framework.Assert;
import org.junit.Test;

public class InvoiceServiceTest {
	@Test
	public void givenDistanceAndTime_ShouldReturnTotalFare() {
		InvoiceService invoiceService = new InvoiceService();
		double distance = 2.0;
		int time = 5;
		double totalFare = invoiceService.CalculateFare(distance, time);
		Assert.assertEquals(25, totalFare, 0);
	}

	@Test
	public void givenLessDistanceAndTime_ShouldReturnMinFare() {
		InvoiceService invoiceService = new InvoiceService();
		double distance = 0.2;
		int time = 1;
		double totalFare = invoiceService.CalculateFare(distance, time);
		Assert.assertEquals(5.0, totalFare, 0);
	}

}

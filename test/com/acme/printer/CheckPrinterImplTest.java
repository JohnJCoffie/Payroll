package com.acme.printer;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class CheckPrinterImplTest {

	@Test
	public void testPrintingChecks() {
		List<Paycheck> checks = Arrays.asList(
				new TestPaycheck("11-15-2018", "1000.00", "Jane Doe"),
				new TestPaycheck("11-15-2018", "800.00", "John Doe"),
				new TestPaycheck("11-15-2018", "1500.00", "Sam Smith"));
		
		CheckPrinter printer = new CheckPrinterImpl();
		printer.print(checks);
	}
	
	private class TestPaycheck implements Paycheck {
		private String date;
		private String amount;
		private String to;

		public TestPaycheck(String date, String amount, String to) {
			this.date = date;
			this.amount = amount;
			this.to = to;
		}

		@Override
		public String date() {
			return date;
		}

		@Override
		public String payableTo() {
			return to;
		}

		@Override
		public String amount() {
			return amount;
		}

		@Override
		public String memo() {
			return "";
		}
		
	}

}

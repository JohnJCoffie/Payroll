package com.acme.printer;

import java.util.List;

public class CheckPrinterImpl implements CheckPrinter {

	@Override
	public void print(List<Paycheck> checks) {
		for(Paycheck check : checks) {
			System.out.println(String.format("Paycheck to %s for $%s", check.payableTo(), check.amount()));
		}
	}

}

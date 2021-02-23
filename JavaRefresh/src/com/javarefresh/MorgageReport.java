package com.javarefresh;

import java.text.NumberFormat;

public class MorgageReport {

    private MorgageCalculator calculator;
    private final NumberFormat currency;    
    
    public MorgageReport(MorgageCalculator calculator) {
        this.calculator = calculator;
        currency = NumberFormat.getCurrencyInstance();
    }

	void printPaymentSchedule() {
        double[] payemntShedules = calculator.getPaymentSchedule();
	    System.out.println();
	    System.out.println("PAYMENT SCHEDULE");
	    System.out.println("----------------");
	    for (short month = 1; month <= payemntShedules.length; month++) 
	        System.out.println(currency.format(payemntShedules[month - 1]));
	}

	void printMortgage() {
	    double mortgage = calculator.calculateMortgage();
	    System.out.println();
        System.out.println("MORTGAGE");
        System.out.println("--------");
        System.out.println("Monthly Payments: " + currency.format(mortgage));
	}
    
}

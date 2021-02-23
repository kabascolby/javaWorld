package com.javarefresh;

public class MorgageCalculator {
    private final static byte MONTHS_IN_YEAR = 12;
    private final static byte PERCENT = 100;

    private int principal;
    private float annualInterest;
    private byte years;
    private int numberOfPayments;

    public MorgageCalculator(int principal, float annualInterest, byte years) {
        this.principal = principal;
        this.annualInterest = annualInterest;
        this.years = years;
        numberOfPayments = getNumberOfPayements();
    }

	public double calculateBalance(short numberOfPaymentsMade) {
	    float monthlyInterest = getMonthlyInterest();
	    double balance = principal
	            * (Math.pow(1 + monthlyInterest, numberOfPayments) - Math.pow(1 + monthlyInterest, numberOfPaymentsMade))
	            / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
	
	    return balance;
	}
    
	public double calculateMortgage() {
        
        double mortgage = principal
        * (getMonthlyInterest() * 
        Math.pow(1 + getMonthlyInterest(), numberOfPayments))
        / (Math.pow(1 + getMonthlyInterest(), numberOfPayments) - 1);
        
	    return mortgage;
	}

    private float getMonthlyInterest() {
        return annualInterest / PERCENT / MONTHS_IN_YEAR;
    }
    
    private int getNumberOfPayements() {
        return years * MONTHS_IN_YEAR;
    }

    public double[] getPaymentSchedule() {
        var balances = new double[numberOfPayments];
 
        for (short month = 1; month <= balances.length; month++) 
	        balances[month - 1] = calculateBalance((short) (month - 1));
        return balances;
    }
}

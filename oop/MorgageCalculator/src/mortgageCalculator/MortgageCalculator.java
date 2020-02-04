package mortgageCalculator;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * MortgageCalculator
 */
public class MortgageCalculator {

    private int loan;
    private float annualInterest;
    private short years;
    private final byte PERCENT = 100;
    private final byte MONTH_IN_YEAR = 12;

    public MortgageCalculator(int loan, float annualInterest, short years) {
        this.loan = loan;
        this.annualInterest = annualInterest;
        this.years = years;
    }

    public double calculategMorgage() {

        // formula M = p * (r(1 + r)^n /(1 + r)^n - 1)
        double morgage = loan * (getMonthlyInterest() * (Math.pow((1.0F + getMonthlyInterest()), getNumberOfPayment())
                / (Math.pow((1.0F + getMonthlyInterest()), getNumberOfPayment()) - 1)));
        return morgage;
    }

    public double calculateBalance(short numberOfPayementsMade) {
        return (loan * (Math.pow((1 + getMonthlyInterest()), getNumberOfPayment())
                - Math.pow((1 + getMonthlyInterest()), numberOfPayementsMade)))
                / (Math.pow((1 + getMonthlyInterest()), getNumberOfPayment()) - 1);
    }

    public double[] getRemainingBalances() {
        var balances = new double[getNumberOfPayment()];
        for (short numberOfPayementsMade = 1; numberOfPayementsMade <= balances.length; numberOfPayementsMade++)
            balances[numberOfPayementsMade - 1] = calculateBalance(numberOfPayementsMade);
        return balances;
    }

    private float getMonthlyInterest() {
        return annualInterest / PERCENT / MONTH_IN_YEAR;
    }

    private short getNumberOfPayment() {
        return (short) (years * MONTH_IN_YEAR);
    }
}

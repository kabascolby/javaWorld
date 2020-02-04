package mortgageCalculator;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * MortgageReport
 */
public class MortgageReport {
    private MortgageCalculator calculator;
    private final NumberFormat currency;

    public MortgageReport(MortgageCalculator calculator) {
        this.calculator = calculator;
        currency = NumberFormat.getCurrencyInstance(Locale.US);
    }

    public void printMortgage() {
        // Printing the mortgage
        double mortgage = calculator.calculategMorgage();
        System.out.println();
        System.out.println("MORGAGE\n------");
        System.out.println("Monthly Payments: " + currency.format(mortgage));
    }

    public void printPaymentSchedule() {
        // printing the payemnt Schedule
        System.out.println();
        System.out.println("PAYMENT SCHEDULE\n----------------");
        for (double balance : calculator.getRemainingBalances())
            System.out.println(currency.format(balance));
    }
}
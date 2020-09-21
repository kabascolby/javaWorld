package mortgageCalculator;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        final int minLoan = 1000;
        final int maxLoan = 1_0000_000;
        final byte maxInterestRate = 30;
        final byte maxPayementsYears = 30;
        // Getting a principal loan
        int loan = (int) Console.readNumber("Principal ($1k - $1M)", "\\d+", minLoan, maxLoan);
        // Getting the annual interest rate (r) by dividing by 100 and dived 12
        float annualInterest = (float) Console.readNumber("Annnual Interest Rate", "-?\\d+(\\.\\d+)?", 1,
                maxInterestRate);

        // Getting the years of payements (n) period * 12
        byte years = (byte) Console.readNumber("Period (Years)", "\\d+", 1, maxPayementsYears);

        var calculator = new MortgageCalculator(loan, annualInterest, years);

        // Creating a report object.
        var report = new MortgageReport(calculator);
        report.printMortgage();
        report.printPaymentSchedule();
    }
}
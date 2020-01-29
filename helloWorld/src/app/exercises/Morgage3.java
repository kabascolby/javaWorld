package app.exercises;

import java.text.NumberFormat;
import java.util.Locale;
import java.lang.Math;
import java.util.Scanner;

/**
 * Morgage3
 */
public class Morgage3 {

    public static void main(String[] args) {
        final int minLoan = 1000;
        final int maxLoan = 1_0000_000;
        final byte maxInterestRate = 30;
        final byte maxPayementsYears = 30;
        final byte PERCENT = 100;
        final byte MONTH_IN_YEAR = 12;
        // Getting a principal loan
        int loan = (int) readNumber("Principal ($1k - $1M)", "\\d+", minLoan, maxLoan);

        // Getting the annual interest rate (r) by dividing by 100 and dived 12
        float annualInterestRate = (float) readNumber("Annnual Interest Rate", "-?\\d+(\\.\\d+)?", 1, maxInterestRate);

        // Getting the years of payements (n) period * 12
        byte years = (byte) readNumber("Period (Years)", "\\d+", 1, maxPayementsYears);
        // Calculating the monthly interest
        float monthlyInterest = annualInterestRate / PERCENT / MONTH_IN_YEAR;
        // calculating number of payments
        short numberOfPayements = (short) (years * MONTH_IN_YEAR);

        printMortgage(loan, annualInterestRate, years, monthlyInterest, numberOfPayements);

        printPaymentSchedule(loan, monthlyInterest, numberOfPayements);
    }

    private static void printPaymentSchedule(int loan, float monthlyInterest, short numberOfPayements) {
        // printing the payemnt Schedule
        System.out.println();
        System.out.println("PAYMENT SCHEDULE\n----------------");
        double payements = 0;
        for (short numberOfPayementsMade = 1; numberOfPayementsMade <= numberOfPayements; numberOfPayementsMade++) {
            payements = printingPaymentSchedule(loan, monthlyInterest, numberOfPayements, numberOfPayementsMade);
            System.out.println(NumberFormat.getCurrencyInstance(Locale.US).format(payements));
        }
    }

    private static void printMortgage(int loan, float annualInterestRate, byte years, float monthlyInterest,
            short numberOfPayements) {
        // Printing the mortgage
        double mortgage = calculatingMorgage(loan, annualInterestRate, years, monthlyInterest, numberOfPayements);
        System.out.println();
        System.out.println("MORGAGE\n------");
        System.out.println("Monthly Payments: " + NumberFormat.getCurrencyInstance(Locale.US).format(mortgage));
    }

    public static double readNumber(String prompt, String regex, double min, double max) {
        Scanner scanner = new Scanner(System.in);
        double value;
        while (true) {
            System.out.print(prompt + ": ");
            String temp = scanner.nextLine().trim();
            value = temp.matches(regex) ? Double.parseDouble(temp) : 0;
            if (value >= min && value <= max)
                break;
            System.out.println("Enter a value between " + min + " and " + max);
        }
        // scanner.close();
        return value;
    }

    public static double printingPaymentSchedule(int loan, float monthlyInterest, short numberOfPayements,
            short numberOfPayementsMade) {
        return (loan * (Math.pow((1 + monthlyInterest), numberOfPayements)
                - Math.pow((1 + monthlyInterest), numberOfPayementsMade)))
                / (Math.pow((1 + monthlyInterest), numberOfPayements) - 1);
    }

    public static double calculatingMorgage(int loan, float annualInterestRate, byte years, float monthlyInterest,
            short numberOfPayements) {
        // formula M = p * (r(1 + r)^n /(1 + r)^n - 1)
        double morgage = loan * (monthlyInterest * (Math.pow((1.0F + monthlyInterest), numberOfPayements)
                / (Math.pow((1.0F + monthlyInterest), numberOfPayements) - 1)));
        return morgage;
    }
}
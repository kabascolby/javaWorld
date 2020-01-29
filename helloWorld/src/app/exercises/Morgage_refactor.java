package app.exercises;

/**
 * Morgage_refactor
 */

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;
import java.lang.Math;

public class Morgage_refactor {

    public static void main(String[] args) {
        final int minLoan = 1000;
        final int maxLoan = 1_0000_000;
        final byte maxInterestRate = 30;
        final byte maxPayementsYears = 30;

        // Getting a principal loan
        int loan = (int) readNumber("Principal ($1k - $1M)", "\\d+", minLoan, maxLoan);

        // Getting the annual interest rate (r) by dividing by 100 and dived 12
        float annualInterestRate = (float) readNumber("Annnual Interest Rate", "-?\\d+(\\.\\d+)?", 1, maxInterestRate);

        // Getting the years of payements (n) period * 12
        byte years = (byte) readNumber("Period (Years)", "\\d+", 1, maxPayementsYears);

        // Getting the mortage
        double mortage = calculatingMorgage(loan, annualInterestRate, years);
        System.out.println("Mortage: " + NumberFormat.getCurrencyInstance(Locale.US).format(mortage));
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

    public static double calculatingMorgage(int loan, float annualInterestRate, byte years) {
        final byte MONTH_IN_YEAR = 12;
        final byte PERCENT = 100;
        float monthlyInterest = annualInterestRate / PERCENT / MONTH_IN_YEAR;
        short numberOfPayements = (short) (years * MONTH_IN_YEAR);
        // formula M = p * (r(1 + r)^n /(1 + r)^n - 1)
        double morgage = loan * (monthlyInterest * (Math.pow((1.0F + monthlyInterest), numberOfPayements)
                / (Math.pow((1.0F + monthlyInterest), numberOfPayements) - 1)));
        return morgage;
    }
}

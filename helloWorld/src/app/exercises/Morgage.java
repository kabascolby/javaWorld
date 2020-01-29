package app.exercises;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;
import java.lang.Math;

/**
 * Morgage
 */
public class Morgage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int loan, numberPayements;
        float monthInterestRate;
        byte period;
        double result;
        String mortage;

        System.out.print("Principal: ");
        loan = scanner.nextInt();
        System.out.print("Annnual Interest Rate: ");
        // Getting the interest rate (r) by dividing by 100 and dived by number of month
        // 12;
        monthInterestRate = (scanner.nextFloat() / 100) / 12;
        System.out.print("Period (Years): ");
        period = (byte) scanner.nextFloat();
        // caculating the number of payements (n) period * 12
        numberPayements = period * 12;

        // formula M = p * (r(1 + r)^n /(1 + r)^n - 1)
        result = loan * (monthInterestRate * (Math.pow((1.0F + monthInterestRate), numberPayements)
                / (Math.pow((1.0F + monthInterestRate), numberPayements) - 1)));
        mortage = NumberFormat.getCurrencyInstance(Locale.US).format(result);
        System.out.println("Mortage: " + mortage);

    }

}
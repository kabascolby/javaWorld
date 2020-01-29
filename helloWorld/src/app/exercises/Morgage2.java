package app.exercises;

/**
 * Morgage2
 */

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;
import java.lang.Math;

public class Morgage2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int minLoan = 1000;
        final int maxLoan = 1_0000_000;
        final byte maxInterestRate = 30;
        final byte maxPayementsYears = 30;
        int loan, numberPayements;
        float monthlyInterestRate;
        byte period;
        double result;
        String mortage, temp;

        while (true) {
            System.out.print("Principal ($1k - $1M): ");
            temp = scanner.nextLine().trim();
            loan = temp.matches("\\d+") ? Integer.parseInt(temp) : 0;
            if (loan >= minLoan && loan <= maxLoan)
                break;
            System.out.println("Enter a number between 1,000 and 1,000,000");
        }

        // Getting the interest rate (r) by dividing by 100 and dived 12
        do {
            System.out.print("Annnual Interest Rate: ");
            temp = scanner.nextLine().trim();
            monthlyInterestRate = temp.matches("-?\\d+(\\.\\d+)?") ? Float.parseFloat(temp) : 0;
            if ((monthlyInterestRate > 0) && (monthlyInterestRate <= maxInterestRate))
                break;
            System.out.println("Enter a value greater than 0 and less than or equal to 30");
        } while (true);

        // caculating the number of payements (n) period * 12
        do {
            System.out.print("Period (Years): ");
            temp = scanner.nextLine().trim();
            period = temp.matches("\\d+") ? Byte.parseByte(temp) : 0;
            if (period > 0 && period >= maxPayementsYears)
                break;
            System.out.println("enter a year between 1 and 30");
        } while (true);
        numberPayements = period * 12;
        // formula M = p * (r(1 + r)^n /(1 + r)^n - 1)
        monthlyInterestRate = monthlyInterestRate / 100 / 12;
        result = loan * (monthlyInterestRate * (Math.pow((1.0F + monthlyInterestRate), numberPayements)
                / (Math.pow((1.0F + monthlyInterestRate), numberPayements) - 1)));
        mortage = NumberFormat.getCurrencyInstance(Locale.US).format(result);
        System.out.println("Mortage: " + mortage);

    }
}
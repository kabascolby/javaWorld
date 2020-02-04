package mortgageCalculator;

import java.util.Scanner;

/**
 * Console
 */
public class Console {

    private static Scanner scanner = new Scanner(System.in);

    public static double readNumber(String prompt) {
        return scanner.nextDouble();
    }

    public static double readNumber(String prompt, String regex, double min, double max) {
        Scanner scanner = Console.scanner;
        double value;
        while (true) {
            System.out.print(prompt + ": ");
            String temp = scanner.nextLine().trim();
            value = temp.matches(regex) ? Double.parseDouble(temp) : 0;
            if (value >= min && value <= max)
                break;
            System.out.println("Enter a value between " + min + " and " + max);
        }
        return value;
    }
}
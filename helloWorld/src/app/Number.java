package app;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 * Number
 */
public class Number {

    public static void main(String[] args) {
        String result = NumberFormat.getPercentInstance().format(0.1);
        // NumberFormat currency = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println(NumberFormat.getCurrencyInstance(Locale.US).format(12345.5));
        System.out.println(result);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Age: ");
        Byte age = (byte) scanner.nextDouble();
        System.out.print("Your Name: ");
        String name = scanner.nextLine().replaceAll("\\s+", "").trim();
        System.out.println("You are " + name + " and you have " + age + " years old");
        scanner.close();
    }
}
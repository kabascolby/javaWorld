package app;

import java.text.NumberFormat;
import java.util.Scanner;

/**
 * Number
 */
public class Number {

    public static void main(String[] args) {
        String result = NumberFormat.getPercentInstance().format(0.1);
        System.out.println(result);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Age: ");
        Byte age = (byte) scanner.nextDouble();
        scanner = new Scanner(System.in);
        System.out.print("Your Name: ");
        String name = scanner.nextLine().replaceAll("\\s+", "").trim();
        System.out.println("You are " + name + " and you have " + age + " years old");
    }
}
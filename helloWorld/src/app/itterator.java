package app;

import java.util.Scanner;

/**
 * itterator
 */
public class itterator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        while (true) {
            System.out.print("Input: ");
            input = scanner.nextLine().trim().toLowerCase();
            if (input.equals("quit"))
                break;
            System.out.println(input);
        }
    }
}
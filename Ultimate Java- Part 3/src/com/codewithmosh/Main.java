package com.codewithmosh;

import java.io.IOException;

import com.codewithmosh.exceptions.Account;
import com.codewithmosh.exceptions.ExceptionsDemo;

public class Main {
    public static void main(String[] args) {
        ExceptionsDemo.show();
        try {
            ExceptionsDemo.accountHandler();
        } catch (Throwable e) {
            System.out.println("Unexpected Error Occur\n" + e.getMessage());
        }
        ExceptionsDemo.inputOutput();
        try {
            Account.checkDeposit(-1);
        } catch (IOException e) {
            // System.err.println(e.getMessage());
            e.printStackTrace();
        }
    }
}

package com.learningwithmosh;

import java.io.IOException;

import com.learningwithmosh.exceptions.ExceptionsDemo;
import com.learningwithmosh.generics.ListDemo;

public class Main {
    public static void main(String[] args) /* throws Exception */ {
        /* try {
            ExceptionsDemo.show();
        } catch (Throwable e) {

            System.out.println(e.getMessage());
            System.out.println("An unexpected error occurred.");
            e.printStackTrace();
        } */

        ListDemo.show();
    }
}

package com.learningwithmosh;

import java.io.IOException;

import com.learningwithmosh.exceptions.ExceptionsDemo;

public class Main {
    public static void main(String[] args) /* throws Exception */ {
        try {
            ExceptionsDemo.show();
        } catch (IOException e) {

            System.out.println(e.getMessage());
            System.out.println("An unexpected error occurred.");
            // TODO Auto-generated catch block
            // e.printStackTrace();
        }
    }
}

package com.learningwithmosh.exceptions;

import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;


public class ExceptionsDemo {

    public static void show() throws AccountException {

        var account = new Account();
        account.deposit(10);

        account.deposit(8);
        account.widraw(30);
        // try {

        // } catch (IOException | InsufficientFundsException e) {
        //     // System.out.println(e.getMessage());
        //    throw e;
        // }
       
        try(
            var reader = new FileReader("lamine.txt");
            ){
            var value = reader.read();
            new SimpleDateFormat().parse("source");
       
        } catch (IOException | ParseException e) {
            System.out.println("Problem reading the file");
            e.getMessage();
        }
        finally {
            System.out.println("file read success");
        }

    }

    public static void sayHello(String name) {
        System.out.println(name.toUpperCase());   
    }
}
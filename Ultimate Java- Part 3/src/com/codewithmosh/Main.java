package com.codewithmosh;

import java.io.IOException;

import com.codewithmosh.exceptions.Account;
import com.codewithmosh.exceptions.ExceptionsDemo;
import com.codewithmosh.generics.User;
import com.codewithmosh.generics_clone.GenericList;
import com.codewithmosh.generics_clone.List;
import com.codewithmosh.generics_clone.ListSolution2;
import com.codewithmosh.generics_clone.Utility;

import jdk.jshell.execution.Util;

// import com.codewithmosh.generics_clone.Users;
import com.codewithmosh.generics_clone.Constraint;

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

        var list = new List();
        list.add(10);

        var listObject = new ListSolution2();
        listObject.add(10);
        listObject.add("hello");
        String word  = (String)listObject.get(1);
        System.out.println(word);

        var genList = new GenericList<Integer>();
        genList.add(10);
        genList.add(20);
        // System.out.println(genList);

        // Constraint<Integer> numList = new Constraint<Integer>();
        // numList.add(2);
        // System.out.println(numList.get(0));
        User user1 = new User(10);
        var user2 = new User(12);
        if(user1.compareTo(user2) > 0)
            System.out.println("User1 is greater");
        else if(user1.compareTo(user2) == 0)
            System.out.println("they are equal");
        else
            System.out.println("user2 is greater");
        Utility.keyvaluePair(5, "Lamine");
    }
}

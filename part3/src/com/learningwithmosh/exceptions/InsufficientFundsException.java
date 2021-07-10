package com.learningwithmosh.exceptions;


public class InsufficientFundsException extends Exception {

    public InsufficientFundsException(String message) {
        super(message);
    }

    public InsufficientFundsException() {
        super("Insufficient funds in your account.");
    }
    
}

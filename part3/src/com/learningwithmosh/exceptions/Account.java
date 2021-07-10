package com.learningwithmosh.exceptions;

import java.io.IOError;
import java.io.IOException;

public class Account {
    private float balance;
    
    public void deposit(int value) throws AccountException {
        if(value <= 0)
            throw new AccountException(new InsufficientFundsException("insufficient amount"));
        balance += value;
    }

    
    public void widraw(float value) throws AccountException {
        if(value > balance)
            throw new AccountException(new InsufficientFundsException());
    }
}

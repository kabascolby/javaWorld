package com.learningwithmosh.exceptions;

import java.io.IOError;
import java.io.IOException;

public class Account {
    
    public void deposit(int value) throws IOException {
        if(value <= 0)
            throw new IOException("insufficient amount");
    }
}

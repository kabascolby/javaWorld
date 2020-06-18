package com.codewithmosh.generics_clone;

import java.util.ArrayList;


public class Constraint<T extends Comparable>{
    private T[] items = (T[]) new Object[10];
    private int count;

    public void add(T value) {
        items[count++] = value;
    }

    public T get(int index) {
        return items[index];
    }

    // @Override
    // public double doubleValue() {
    //     // TODO Auto-generated method stub
    //     return 0;
    // }

    // @Override
    // public float floatValue() {
    //     // TODO Auto-generated method stub
    //     return 0;
    // }

    // @Override
    // public int intValue() {
    //     // TODO Auto-generated method stub
    //     return 0;
    // }

    // @Override
    // public long longValue() {
    //     // TODO Auto-generated method stub
    //     return 0;
    // }
    
}
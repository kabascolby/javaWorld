package com.codewithmosh.generics_clone;

import java.util.Arrays;

public class GenericList<T> {

    private T[] items = (T[]) new Object[10];
    private int count;

    public void add(T value) {
        items[count++] = value;
    }

    public T get(int index) {
        return items[index];
    }

    @Override
    public String toString() {
        return "GenericList [count=" + count + ", items=" + Arrays.toString(items) + "]";
    }
    
}
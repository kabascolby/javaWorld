package com.learningwithmosh.generics;

public class List {
    private Object[] items = new Object[10];
    private Object count;

    public void add(int item) {
        items[count++] = item;
    }

    public Object get(int index) {
        return items[index];
    }

}

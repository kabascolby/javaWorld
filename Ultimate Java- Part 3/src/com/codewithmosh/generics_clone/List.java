package com.codewithmosh.generics_clone;

public class List {
    private int[] items = new int[10];
    private int index;

    public void add(int value){
        items[index++] = value;
    }

    public int get(int index){
        return items[index];
    }
}
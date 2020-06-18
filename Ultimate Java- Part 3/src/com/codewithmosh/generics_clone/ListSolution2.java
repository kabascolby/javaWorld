package com.codewithmosh.generics_clone;

//with this solution we are creation a generic list by using an Array of object
/*
    The probleme with this implementation is we have to use an explicit cast to get an element.
    So for each index we have to remember the type of the element at that index.
    if the cast type is invalide we get and cast error at runtime;
    ex: var list = new ListSolution();
    list.add(10);
    list.add("hello");
    String word  = (String)list.get(2);
*/
public class ListSolution2 {
    private Object[] list = new Object[10];
    private byte index;

    public void add(Object value){
        list[index++] = value;
    }

    public Object get(int index){
        return list[index];
    }
}
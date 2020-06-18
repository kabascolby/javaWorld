package com.codewithmosh.generics_clone;

public class Utility {
    public static <T extends Comparable <T>> T max(T first, T second){
        return first.compareTo(second) > 0 ? first : second;
    }

    public static <K, V> void keyvaluePair(K key, V value){
        System.out.println(key + " = " + value );
    }
}
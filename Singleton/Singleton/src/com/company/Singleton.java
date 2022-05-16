package com.company;

// Singleton

public class Singleton {

    private static Singleton instance;

    private Singleton(String value) {
        System.out.println("This is an " + value);
    }

    public static Singleton getInstance(String value) {
        if (instance == null) {
            instance = new Singleton(value);
        }
        return instance;
    }
}

package com.company;

// Client

public class Main {

    public static void main(String[] args) {

        Singleton animal = Singleton.getInstance("Animal");
        System.out.println(animal.hashCode() + "\n");

        Singleton animal2 = Singleton.getInstance("Human");
        System.out.println(animal2.hashCode() + "\n");
    }
}

// Lazy Singleton - создается только при обращении к .getInstance()
// Eager - создается при загрузке классов, 
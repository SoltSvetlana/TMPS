package com.company;

// Client

public class Main {

    public static void main(String[] args) {
        Animal original = new Animal("Tom", 1, 0);
        System.out.println(original);

        Animal copy = (Animal)original.clone();
        System.out.println(copy);

        System.out.println(original);
    }

}

package com.company;

// Client

public class Main {

    public static void main(String[] args) {
        Database database = new Adapter();

        database.insert();
        database.update();
        database.select();
        database.remove();
    }
}

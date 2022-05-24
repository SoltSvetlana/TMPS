package com.company;

public class Main {

    public static void main(String[] args) {
        AppDatabase project = new ProxyProject("https://database.com/Hello.db");

        project.run();
        project.run();

    }
}

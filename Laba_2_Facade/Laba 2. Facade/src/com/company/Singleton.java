package com.company;

// Facade

public class Singleton {

    private static Singleton instance;

    private Singleton() {
        Status status = new Status();
        status.getFood();

        FeedingProcess process = new FeedingProcess();
        process.startFeeding();

        Animal animals = new Animal();
        animals.eat(process);

        process.finishFeeding();
        animals.eat(process);
    }

    public static com.company.Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}



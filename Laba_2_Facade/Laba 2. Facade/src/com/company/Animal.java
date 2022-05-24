package com.company;

// SUBCLASS 3

public class Animal {

    public void eat(FeedingProcess process) {
        if (process.areEatingStatus() == true) {
            System.out.println("Животные начинают кушать");
        } else {
            System.out.println("Животные заканчивают кушать");
        }
    }


}

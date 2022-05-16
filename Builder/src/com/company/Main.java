package com.company;

// Client

public class Main {

    public static void main(String[] args) {

        Director director = new Director();
        director.setBuilder(new CrocodileHouse());
        AnimalHouse animalHouse1 = director.BuildHouse();
        System.out.println(animalHouse1);

        director.setBuilder(new FishPool());
        AnimalHouse animalHouse2 = director.BuildHouse();
        System.out.println(animalHouse2);

        director.setBuilder(new HorseHouse());
        AnimalHouse animalHouse3 = director.BuildHouse();
        System.out.println(animalHouse3);

    }
}

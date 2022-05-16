package com.company;

public class Director {
    AnimalHouseBuilder builder;
    void setBuilder(AnimalHouseBuilder b) {
        builder = b;
    }

    AnimalHouse BuildHouse() {
        builder.buildAnimalHouse();
        builder.buildMake();
        builder.buildType();
        builder.buildBudget();
        AnimalHouse animalHouse = builder.getAnimalHouse();
        return animalHouse;
    }
}

package com.company;

// Product B

public class CrocodileHouse extends AnimalHouseBuilder{
    @Override
    void buildMake() {
        animalHouse.setMake("A house for a crocodile");
    }

    @Override
    void buildType() {
        animalHouse.setType(Type.MIXED);
    }

    @Override
    void buildBudget() {
        animalHouse.setBudget(13000);
    }
}

package com.company;

// Product C

public class FishPool extends AnimalHouseBuilder{
    @Override
    void buildMake() {
        animalHouse.setMake("A pool for fish");
    }

    @Override
    void buildType() {
        animalHouse.setType(Type.WATER);
    }

    @Override
    void buildBudget() {
        animalHouse.setBudget(4000);
    }
}

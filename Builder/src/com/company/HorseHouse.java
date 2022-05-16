package com.company;

// Product A

public class HorseHouse extends AnimalHouseBuilder{
    @Override
    void buildMake() {
        animalHouse.setMake("A house for a horse");
    }

    @Override
    void buildType() {
        animalHouse.setType(Type.GROUND);
    }

    @Override
    void buildBudget() {
        animalHouse.setBudget(9000);
    }
}

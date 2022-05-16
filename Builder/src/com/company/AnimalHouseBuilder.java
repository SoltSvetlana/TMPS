package com.company;

// Interface Builder

abstract class AnimalHouseBuilder{
    AnimalHouse animalHouse;
    void buildAnimalHouse() {
        animalHouse = new AnimalHouse();
    }

    abstract void buildMake();
    abstract void buildType();
    abstract void buildBudget();

    AnimalHouse getAnimalHouse () {
        return animalHouse;
    }



}

package com.company;

// ConcreteProductC2

public class SanFranciscoWater implements WaterAnimalsHouse {
    @Override
    public void buildPool() {
        System.out.println("Pool Created!");
    }

    @Override
    public void digPond() {
        System.out.println("Pond has been dug");
    }

    @Override
    public void makeAquarium() {
        System.out.println("Aquarium Created!");
    }
}

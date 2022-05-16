package com.company;

// ConcreteProductB1

public class ChisinauSky implements SkyAnimalsHouse {
    @Override
    public void nestingBox() {
        System.out.println("Скворечник собран!");
    }

    @Override
    public void birdHouse() {
        System.out.println("Птичий дом создан!");
    }
}

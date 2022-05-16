package com.company;

// ConcreteProductA2

public class SanFranciscoGround implements GroundAnimalsHouse {

    @Override
    public void cabin() {
        System.out.println("A cabin is found!");
    }

    @Override
    public void smallCage() {
        System.out.println("Small Cage Created!");
    }

    @Override
    public void largeCage() {
        System.out.println("Large Cage Created!");
    }
}

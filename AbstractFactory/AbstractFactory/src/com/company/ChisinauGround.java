package com.company;

// ConcreteProductA1

public class ChisinauGround implements GroundAnimalsHouse {

    @Override
    public void cabin() {
        System.out.println("Комнатка найдена!");
    }

    @Override
    public void smallCage() {
        System.out.println("Маленькая клетка создана!");
    }

    @Override
    public void largeCage() {
        System.out.println("Большая клетка создана!");
    }
}

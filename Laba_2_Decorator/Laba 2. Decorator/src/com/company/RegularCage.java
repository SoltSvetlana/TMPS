package com.company;

// CONCRETE COMPONENT

public class RegularCage implements Cage{

    @Override
    public void updateCage() {
        System.out.println("Стандартная клетка была построена!");
    }
}

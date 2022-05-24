package com.company;

// BASE DECORATOR

public class BaseCage implements Cage{

    protected Cage c;

    public BaseCage(Cage nazvanie) {
        this.c = nazvanie;
    }

    @Override
    public void updateCage() {
        this.c.updateCage();
    }
}

package com.company;

// CONCRETE DECORATOR

public class CageLevel2 extends BaseCage {
    public CageLevel2(Cage cage) {
        super(cage);
    }

    public void updateCage () {
        super.updateCage();
        System.out.println("Вокруг построен забор!");
    }
}

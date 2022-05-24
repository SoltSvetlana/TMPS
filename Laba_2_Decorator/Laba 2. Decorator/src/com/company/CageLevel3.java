package com.company;

// CONCRETE DECORATOR

public class CageLevel3 extends BaseCage {
    public CageLevel3(Cage cage) {
        super(cage); 
    }

    @Override
    public void updateCage() {
        super.updateCage();
        System.out.println("Вырыт овраг!");
    }
}

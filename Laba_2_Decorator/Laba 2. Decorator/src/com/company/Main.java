package com.company;

// CLIENT

public class Main {

    public static void main(String[] args) {
	    Cage c1 = new RegularCage();
        c1.updateCage();
        System.out.println("----");
        Cage c2 = new CageLevel2(c1);
        c2.updateCage();
        System.out.println("----");
        Cage c3 = new CageLevel3(c2);
        c3.updateCage();
    }
}

package com.company;


public class WaterAnimals extends Animal{
    public String name;
    private String[] waterAnimals = {
            "Fish",
            "Dolphin",
            "Turtle",
            "Sea Star",
            "Sea Horse",
            "Whale",
            "Shark",
            "Squid",
            "Crab"
    };

    public WaterAnimals () {
        this.name = waterAnimals[(int)(Math.random() * waterAnimals.length)];
        setName(this.name);
    }
}

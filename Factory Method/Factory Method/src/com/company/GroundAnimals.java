package com.company;


public class GroundAnimals extends Animal{
        public String name;
        private String[] groundAnimals = {
                "Elephant",
                "Horse",
                "Kangoo",
                "Cat",
                "Bear",
                "Wolf",
                "Dog",
                "Fox",
                "Bunny"
        };


        public GroundAnimals () {
            this.name = groundAnimals[(int)(Math.random() * groundAnimals.length)];
            setName(this.name);
        }
}



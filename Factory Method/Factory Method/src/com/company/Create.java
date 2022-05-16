package com.company;

public class Create {
    private int length;

    public Animal[] createAnimals (int length) {
        this.length = length;
        int toss;

        Animal[] animals = new Animal[length];

        for( int i = 0; i < animals.length; i++) {
            toss = (int)(Math.random() * 2);
            if ( toss == 0 ) {
                animals[i] = new GroundAnimals();
            } else {
                animals[i] = new WaterAnimals();
            }
        }

        for( int i = 0; i < animals.length; i++) {
            System.out.println("\nОбъект №"+(i+1));
            System.out.println(animals[i].toString());

        }
        return animals;
    }
}

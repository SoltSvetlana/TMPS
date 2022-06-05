package com.company.ZooHouseFactory;

public class AnimalHouseFactory {
    private int length;

    private int gr = 0;
    private int wt = 0;
    private int mx = 0;
    private String outputString = "";
    public AnimalHouseFactory(int length) {
        this.length = length;
    }


    public AnimalHouse[] createHouse() {
        AnimalHouse[] animalHouses = new AnimalHouse[length];
        int choice;
        int toss;
        for( int i = 0; i < animalHouses.length; i++) {
            choice = (int)(Math.random() * 3);
            toss = (int)(Math.random() * 2);
            if (choice == 0) {
                animalHouses[i] = new GroundAnimalHouse();
                gr++;
            } else if (choice == 1) {
                animalHouses[i] = new MixedAnimalHouse();
                mx++;
            } else if (choice == 2) {
                animalHouses[i] = new WaterAnimalHouse();
                wt++;
            }
            animalHouses[i].setFeedFlag(toss);
            outputString += animalHouses[i].toString();
        }
        return animalHouses;
    }

    public int getWaterCount () {
        return wt;
    }

    public int getGroundCount () {
        return gr;
    }

    public int getMixedCount () {
        return mx;
    }

    public String getFinalString () {
        return outputString;
    }

}

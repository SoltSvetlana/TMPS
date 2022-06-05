package com.company.ZooHouseFactory;

public class WaterAnimalHouse extends AnimalHouse {

    private String name;
    private String[] waterList = {
            "Shark",
            "Star",
            "Seahorse",
            "Dolphin",
            "Crab",
            "Squid",
            "Shell",
            "Clownfish",
            "Whale",
            "Coral",
            "Shrimp"
    };

    public WaterAnimalHouse() {
        this.name = waterList[(int)(Math.random() * waterList.length)];;
    }

    @Override
    void setFeedFlag(int i) {
        if ( i == 0 ) {
            this.feedFlag = false;
        } else if ( i == 1 ) {
            this.feedFlag = true;
        }
    }

    @Override
    boolean getFeedFlag() {
        return feedFlag;
    }

    public String toString () {
        return name + "[water]" + " " + feedFlag + "*";
    }

}

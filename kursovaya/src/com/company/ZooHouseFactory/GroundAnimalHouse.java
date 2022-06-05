package com.company.ZooHouseFactory;

public class GroundAnimalHouse extends AnimalHouse {

    private String name;
    private String[] groundList = {
            "Elephant",
            "Giraff",
            "Beaver",
            "Kangoo",
            "Lion",
            "Tiger",
            "Bear",
            "Squirrel",
            "Dog",
            "Cat",
            "Goat"
    };

    public GroundAnimalHouse() {
        this.name = groundList[(int)(Math.random() * groundList.length)];;
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
        return name + "[ground]" + " " + feedFlag + "*";
    }
}

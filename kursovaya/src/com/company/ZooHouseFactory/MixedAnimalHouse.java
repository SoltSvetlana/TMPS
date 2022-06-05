package com.company.ZooHouseFactory;

public class MixedAnimalHouse extends AnimalHouse {

    private String name;
    private String[] mixedList = {
            "Frog",
            "Crocodile",
            "Turtle",
            "Lizard",
            "Hippo"
    };

    public MixedAnimalHouse() {
        this.name = mixedList[(int)(Math.random() * mixedList.length)];;
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
        return name + "[mixed]" + " " + feedFlag + "*";
    }
}

package com.company.ZooHouseFactory;


abstract class AnimalHouse {
    boolean feedFlag = false;

    abstract void setFeedFlag (int i);
    abstract boolean getFeedFlag ();

}

package com.company;

// Concrete Builder

public class AnimalHouse {
    String make;
    Type type;
    int budget;

    public void setMake(String make) {
        this.make = make;
    }
    public void setType (Type type) {
        this.type = type;
    }
    public void setBudget(int budget) {
        this.budget = budget;
    }

    public String toString() {
        return "Animal House [Name = "
                + make
                + ", type = "
                + type
                + ", budget = "
                + budget
                + "$]";
    }
}

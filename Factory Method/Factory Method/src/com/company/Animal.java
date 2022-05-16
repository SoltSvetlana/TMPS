package com.company;

public class Animal {
    public String name;
    public int age;
    public int children;

    public Animal () {
        this.age = (int)(1 + Math.random() * 5); //от 1 до 5
        this.children = (int)(1 + Math.random() * 15);
    }

    @Override
    public String toString() {
        return "Name: " + this.name + ", Age: " + this.age + ", Children Number: " + this.children;
    }

    public void setName (String name) {
        this.name = name;
    }
}

package com.company;

// Concrete Prototype

public class Animal implements Copyable {
    String name;
    int age;
    int childNumber;

    public Animal(String name, int age, int childNumber) {
        this.name = name;
        this.age = age;
        this.childNumber = childNumber;
    }

    public String toString() {
        return "Animal name: " + name
                + "\nAnimal age: " + age
                + "\nChildren: " + childNumber
                + "\n" + hashCode() + "\n";
                        // hashCode() - уникальное хеш-значение объекта
    }


    public Object clone() {
            Animal clone = new Animal(name, age, childNumber);
            return clone;
        }
}

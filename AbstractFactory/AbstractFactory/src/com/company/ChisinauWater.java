package com.company;

// ConcreteProductC1

public class ChisinauWater implements WaterAnimalsHouse {

    @Override
    public void buildPool() {
        System.out.println("Бассейн построен!");
    }

    @Override
    public void digPond() {
        System.out.println("Пруд вырыт!");
    }

    @Override
    public void makeAquarium() {
        System.out.println("Аквариум создан!");
    }
}

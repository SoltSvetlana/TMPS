package com.company;

// ConcreteFactory1

public class ChisinauFactory implements AnimalsHouseFactory {
    @Override
    public WaterAnimalsHouse getWaterHouse() {
        return new ChisinauWater();
    }

    @Override
    public GroundAnimalsHouse getGroundHouse() {
        return new ChisinauGround();
    }

    @Override
    public SkyAnimalsHouse getSkyHouse() {
        return new ChisinauSky();
    }
}

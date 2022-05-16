package com.company;

// ConcreteFactory2

public class SanFranciscoFactory implements AnimalsHouseFactory {

    @Override
    public WaterAnimalsHouse getWaterHouse() {
        return new SanFranciscoWater();
    }

    @Override
    public GroundAnimalsHouse getGroundHouse() {
        return new SanFranciscoGround();
    }

    @Override
    public SkyAnimalsHouse getSkyHouse() {
        return new SanFranciscoSky();
    }
}

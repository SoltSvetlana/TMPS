package com.company;

// AbstractFactory Interface

public interface AnimalsHouseFactory {
    WaterAnimalsHouse getWaterHouse();
    GroundAnimalsHouse getGroundHouse();
    SkyAnimalsHouse getSkyHouse();
}

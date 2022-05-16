package com.company;

public class Main {

    public static void main(String[] args) {

        AnimalsHouseFactory factory = getFactoryChoice(1);


        GroundAnimalsHouse CGAH = factory.getGroundHouse();
        SkyAnimalsHouse CSAH = factory.getSkyHouse();
        WaterAnimalsHouse CWAH = factory.getWaterHouse();


        CGAH.largeCage();
        CSAH.birdHouse();
        CWAH.makeAquarium();

        AnimalsHouseFactory factory2 = getFactoryChoice(2);


        GroundAnimalsHouse SGAH = factory2.getGroundHouse();
        SkyAnimalsHouse SSAH = factory2.getSkyHouse();
        WaterAnimalsHouse SWAH = factory2.getWaterHouse();


        SGAH.cabin();
        SSAH.nestingBox();
        SWAH.digPond();


    }

    private static AnimalsHouseFactory getFactoryChoice(int choice) {
        switch (choice) {
            case 1:
                return new ChisinauFactory();
            case 2:
                return new SanFranciscoFactory();
            default:
                throw new RuntimeException(
                        "Ошибка: Можно выбрать только Ресторан(1) или Забегаловка(2)..."
                );
        }
    }
}


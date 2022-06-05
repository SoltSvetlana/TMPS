package com.company.Main;

import com.company.FeedAnimals.Iterator;
import com.company.FeedAnimals.ZooCages;
import com.company.Report.Report;
import com.company.SellTickets.*;
import com.company.ZooHouseFactory.*;

import java.util.*;

public class ZooInitialize {
    private static ZooInitialize instance;
    private String zooName;

    private ZooInitialize() {

        System.out.println("Введите название зоопарка: ");
        Scanner scanner = new Scanner(System.in);
        this.zooName = scanner.nextLine();
        facade();

    }

        public void facade() {
            Counters c1 = new Counters();
            int houseCount = c1.setCounter("вольеров", 100);

            AnimalHouseFactory houseFactory = new AnimalHouseFactory(houseCount);

            Counters c2Kids = new Counters();
            int kidsCount = c2Kids.setCounter("детей, пришедших в зоопарк", 25);
            Counters c2Adults = new Counters();
            int adultsCount = c2Adults.setCounter("взрослых, пришедших в зоопарк", 40);
            Counters c2Students = new Counters();
            int studentsCount = c2Students.setCounter("студентов, пришедших в зоопарк", 15);

            List<Ticket> children = new ArrayList<>();
            List<Ticket> adults = new ArrayList<>();
            List<Ticket> students = new ArrayList<>();
            Composite composite = new Composite();

            for(int i = 0; i < kidsCount; i++) {
                children.add(new Child());
                composite.addComponent(children.get(i));
            }
            for(int i = 0; i < adultsCount; i++) {
                adults.add(new Adult());
                composite.addComponent(adults.get(i));
            }
            for(int i = 0; i < studentsCount; i++) {
                students.add(new Student());
                composite.addComponent(students.get(i));
            }
            System.out.println("--------------------------");
            System.out.println("----------Check-----------");
            composite.sell();
            System.out.println("--------------------------");

            Object[] animals = houseFactory.createHouse();

            ZooCages c = new ZooCages(animals);
            Iterator it = c.getIterator();
            while(it.hasNext()) {
                Object d = it.next();
                System.out.println(d);
            }

            Report newReport = new Report();
            newReport.printToFile(
                    zooName,
                    houseCount,
                    houseFactory.getGroundCount(),
                    houseFactory.getWaterCount(),
                    houseFactory.getMixedCount(),
                    kidsCount + adultsCount + studentsCount,
                    kidsCount,
                    adultsCount,
                    studentsCount,
                    composite.getTotalSum(),
                    houseFactory.getFinalString()
            );
        }
    public static ZooInitialize getInstance() {
        if ( instance == null ) {
            instance = new ZooInitialize();
        }
        return instance;
    }
}
package com.company.Report;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class Report {
    public void printToFile (
            String zooName,
            int animalsHouseNumber,
            int ground,
            int water,
            int mixed,
            int allTickets,
            int kidsTickets,
            int adultsTickets,
            int studentsTickets,
            int sum,
            String animals
    ) {
        File f;
        File path = new File("D:/3 курс 2 семестр/TMPS/Курсовая");
        try {
            f = File.createTempFile("Zoo_Report", ".txt", path);
            PrintWriter pw = new PrintWriter(f);
            pw.print("------------ZOO REPORT-----------------\n");
            pw.print("Name: " + zooName + "\n");
            pw.print("Animals House Number: " + animalsHouseNumber + "\n");
            pw.print("\tGround: " + ground + "\n");
            pw.print("\tWater: " + water + "\n");
            pw.print("\tMixed: " + mixed + "\n");
            pw.print("Tickets Sold: " + allTickets + "\n");
            pw.print("\tKids(20.0L): " + kidsTickets + "\n");
            pw.print("\tAdults(100.0L): " + adultsTickets + "\n");
            pw.print("\tStudents(80.0L): " + studentsTickets + "\n");
            pw.print("Total Sum: " + sum + "L\n");
            pw.println("-------------Animal List----------------");
            pw.println("----Animal[type]---|--Fed?--------------");
            String[] splited = animals.split("\\*+");
            for(int i = 0; i < splited.length; i++) {
                pw.println(i + 1 + ". " + splited[i]);
            }
            pw.println();
            pw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

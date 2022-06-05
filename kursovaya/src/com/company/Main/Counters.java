package com.company.Main;

import java.util.Scanner;

public class Counters {
    public int setCounter (String string, int limit) {
        int count;
        while (true) {
            try {
                System.out.println("Введите количество " + string + " (меньше " + limit + ")");
                Scanner scanner = new Scanner(System.in);
                count = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Количеством может быть только целочисленным числом!");
                continue;
            }
            if ( count > limit ) {
                continue;
            }
            break;
        }
        return count;
    }
}

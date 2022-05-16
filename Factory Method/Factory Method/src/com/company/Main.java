package com.company;

// C L I E N T
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите количество создаваемых объектов:");
        int animalCounter = 0;
        Scanner scanner = new Scanner(System.in);
        animalCounter = scanner.nextInt();

        Create create = new Create();
        Animal[] animals = create.createAnimals(animalCounter);


    }
}

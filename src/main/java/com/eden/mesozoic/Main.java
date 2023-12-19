package com.eden.mesozoic;

import java.util.ArrayList;
import java.util.Scanner;

public class Main extends MainGUI {
    ParkInfo parkInfo = new ParkInfo();
    Scanner scanner = new Scanner(System.in); // Get user input
    ArrayList<Dinosaur> dinoList = new ArrayList<>();

    public static void main(String[] args) {
        Main main = new Main();
        main.start();
    }

    public void start() {
        while (true) {
            displayMenu();
            int choice = scanner.nextInt();
            menuHandler(choice);
        }
    }

    public void displayMenu() {
        System.out.println("Welcome to MesoEden, Assistant!");
        System.out.println("1. Add Dinosaur");
        System.out.println("2. Check Park Hours");
        System.out.println("3. Greet Guest");
        System.out.println("4. Check Visitor Count");
        System.out.println("5. Manage Staff");
        System.out.println("6. Exit");
    }

    public void menuHandler(int choice) {
        switch (choice) {
            case 1 -> {
                addDinosaur();
            }
            case 2 -> {
                System.out.println("Today's hours of operation: ");
                System.out.println(parkInfo.checkParkHours());
            }
            case 3 -> {
                // greetGuest();
                break;
            }
            case 4 -> {
                // checkVisitorCount()
                break;
            }
            case 5 -> {
                // manageStaff()
                break;
            }
            case 6 -> {
                System.out.println("Exiting...");
                System.exit(0);
            }
        }
    }

    public void addDinosaur() {
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Enter dinosaur's name: ");
        String name = scanner1.next();
        System.out.print("Enter dinosaur's species: ");
        String species = scanner1.next();
        System.out.print("Enter dinosaur's diet: ");
        String diet = scanner1.next();
        System.out.print("Enter dinosaur's age: ");
        int age = scanner1.nextInt();
        System.out.print("Enter dinosaur's weight: ");
        int weight = scanner1.nextInt();
        Dinosaur tempDino = new Dinosaur(name, species, diet, age, weight);
        dinoList.add(tempDino);
        System.out.println("Added " + name);
    }
}


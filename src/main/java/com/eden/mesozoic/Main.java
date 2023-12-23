package com.eden.mesozoic;

import org.apache.commons.csv.CSVFormat;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class Main extends MainGUI {
    ParkInfo parkInfo = new ParkInfo();
    Scanner scanner = new Scanner(System.in); // Get user input

    ArrayList<Dinosaur> dinoList = new ArrayList<>();
    ArrayList<Guest> guestList = new ArrayList<>();


    public static void main(String[] args) throws FileNotFoundException{

        ArrayList<Employee> rosterList = new ArrayList<>();
        Employee rich = new Employee("Rich", "Recar", 11367, "Janitor", "Full Time");
        File roster = new File("src/main/resources/roster.csv");
        System.out.println(rich.toString());
        PrintWriter out = new PrintWriter(roster);
        rosterList.add(rich);



        Main main = new Main();
        main.start();


    }

    public void start() {
        while (true) {
            mainMenu();
            int choice = scanner.nextInt();
            mainMenuHandler(choice);
        }
    }

    public void mainMenu(){
        System.out.println("Welcome to MesoEden!");
        System.out.println("1. Guest Information");
        System.out.println("2. Call for Assistance");
        System.out.println("3. Employee Portal"); // Clearance needed
        System.out.println("4. Supervisor Portal"); // Clearance needed
        System.out.println("5. Management Portal"); // Clearance needed
        System.out.println("6. Exit");
    }

    public void employeeMenu() {
        System.out.println("Welcome, Team Member!");
        System.out.println("1. Clock in/0ut");
        System.out.println("2. Check Schedule");
        System.out.println("3. Request Time Off");
        System.out.println("4. Daily Tasks");
        System.out.println("5. Exit");
    }

    public void assistantMenu() {
        System.out.println("Welcome, Assistant!");
        System.out.println("1. Clock in/0ut");
        System.out.println("2. Check Schedule");
        System.out.println("3. Request Time Off");
        System.out.println("4. Add Dinosaur");
        System.out.println("5. Return to Main Menu");
        System.out.println("6. Exit");
    }

    public void managementMenu() {
        System.out.println("Welcome, Captain!");
        System.out.println("1. Scheduling");
        System.out.println("2. Orders");
        System.out.println("3. Maintenance");
        System.out.println("4. Check Visitor Count");
        System.out.println("5. Add Team Member");
        System.out.println("6. Exit");
    }

    public void mainMenuHandler(int choice) {
        switch (choice) {
            case 1 -> {
                // Guest Information
            }
            case 2 -> {
                // Call for assistance
            }
            case 3 -> {
                // Employee Portal
                employeeMenu();
                int caseThreeChoice = scanner.nextInt();
                employeeMenuHandler(caseThreeChoice);
            }
            case 4 -> {
                assistantMenu();
                int caseFourChoice = scanner.nextInt();
//                assistantMenHandler(caseFourChoice); not implemented
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
    public void employeeMenuHandler(int choice2) {
        switch (choice2) {
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


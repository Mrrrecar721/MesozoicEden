package com.eden.mesozoic;

import java.util.ArrayList;
import java.util.Scanner;

public class Main extends MainGUI {
    Scanner scanner = new Scanner(System.in); // Get user input
    static ArrayList<Dinosaur> dinoList = new ArrayList<>();
    public static void main(String[] args) {
        Main main = new Main();

//        launch(args); no UI to implement
        Dinosaur trex1 = new Dinosaur("Steve", "t-Rex", "Carnivore", 7, 127);
        Dinosaur trex2 = new Dinosaur("Rex", "t-Rex", "Carnivore", 10, 217);
        Dinosaur trex3 = new Dinosaur("Razor", "t-Rex", "Carnivore", 9, 188);
        Dinosaur bronto1 = new Dinosaur("Jared", "brontosaurus", "herbivore", 5, 347);
        Dinosaur bronto2 = new Dinosaur("Jackson", "brontosaurus", "herbivore", 13, 422);
        Dinosaur bronto3 = new Dinosaur("Jemini", "brontosaurus", "herbivore", 10, 403);
        Dinosaur bronto4 = new Dinosaur("Johhny", "brontosaurus", "herbivore", 4, 297);
        Dinosaur stego1 = new Dinosaur("Plates", "stegosaurus", "herbivore", 11, 180);
        Dinosaur stego2 = new Dinosaur("Paul", "stegosaurus", "herbivore", 12, 194);
        Dinosaur stego3 = new Dinosaur("Martin", "stegosaurus", "herbivore", 9, 173);


        int avgWeight = 0;
        int avgAge = 0;

        dinoList.add(trex1);
        dinoList.add(trex2);
        dinoList.add(trex3);
        dinoList.add(bronto1);
        dinoList.add(bronto2);
        dinoList.add(bronto3);
        dinoList.add(bronto4);
        dinoList.add(stego1);
        dinoList.add(stego2);
        dinoList.add(stego3);

        main.start();

        String[] dinoNames = new String[10];
        int[] dinoAges = new int[10];
        String[] dinoSpecies = new String[10];
        String[] dinoEnclosures = new String[10];



        for (int i = 0; i < dinoList.size(); i++) {
            dinoNames[i] = dinoList.get(i).getName();
            dinoAges[i] = dinoList.get(i).getAge();
            dinoSpecies[i] = dinoList.get(i).getSpecies();
            avgWeight += dinoList.get(i).getWeight();
            avgAge += dinoList.get(i).getAge();
        }
        avgAge /= dinoList.size();
        avgWeight /= dinoList.size();
        System.out.println("The Average weight is " +
                avgWeight + "kgs. The average age is " +
                avgAge + " years old.");

    }
    public void start(){
        while(true) {
            displayMenu();
            int choice = scanner.nextInt();
            menuHandler(choice);
        }
    }
    public void displayMenu(){
        System.out.println("Welcome to MesoEden, Assistant!");
        System.out.println("1. Add Dinosaur");
        System.out.println("2. Check Park Hours");
        System.out.println("3. Greet Guest");
        System.out.println("4. Check Visitor Count");
        System.out.println("5. Manage Staff");
        System.out.println("6. Exit");
    }
    public void menuHandler(int choice){
         switch(choice){
             case 1 -> {
                 addDinosaur();
             }
             case 2 -> {
                 // checkParkHours()
                 break;
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
    public void addDinosaur(){
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


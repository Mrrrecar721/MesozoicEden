package com.eden.mesozoic;

import java.util.ArrayList;

public class Main extends MainGUI {
    public static void main(String[] args) {
//        launch(args); no UI to implement
        DinoProfile trex1 = new DinoProfile("Steve", "t-Rex", "Carnivore", 7, 127);
        DinoProfile trex2 = new DinoProfile("Rex", "t-Rex", "Carnivore", 10, 217);
        DinoProfile trex3 = new DinoProfile("Razor", "t-Rex", "Carnivore", 9, 188);
        DinoProfile bronto1 = new DinoProfile("Jared", "brontosaurus", "herbivore", 5, 347);
        DinoProfile bronto2 = new DinoProfile("Jackson", "brontosaurus", "herbivore", 13, 422);
        DinoProfile bronto3 = new DinoProfile("Jemini", "brontosaurus", "herbivore", 10, 403);
        DinoProfile bronto4 = new DinoProfile("Johhny", "brontosaurus", "herbivore", 4, 297);
        DinoProfile stego1 = new DinoProfile("Plates", "stegosaurus", "herbivore", 11, 180);
        DinoProfile stego2 = new DinoProfile("Paul", "stegosaurus", "herbivore", 12, 194);
        DinoProfile stego3 = new DinoProfile("Martin", "stegosaurus", "herbivore", 9, 173);

        ArrayList<DinoProfile> dinoList = new ArrayList<>();
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
}


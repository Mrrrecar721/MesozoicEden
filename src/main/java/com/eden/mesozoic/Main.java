package com.eden.mesozoic;


public class Main extends MainGUI {
    public static void main(String[] args) {
        launch(args);
        Profile trex = new Profile("Steve", "t-Rex", "Carnivore", 7, 127);

        trex.printProfile();
        trex.isCarnivore();

        System.out.println(trex.getDailyFood());

    }
}


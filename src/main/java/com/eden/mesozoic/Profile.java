package com.eden.mesozoic;

import java.text.DecimalFormat;
import java.util.Objects;

public class Profile {
    private String name;
    private String species;
    private String diet;
    private int age;
    private double dailyFood;
    private int weight;

    private DecimalFormat df = new DecimalFormat("#.000");

    Profile(String name, String species, String diet, int age, int weight){
        this.name = name;
        this.species = species;
        this.diet = diet;
        this.age = age;
        this.weight = weight;
        dailyFood = switch(species.toLowerCase()){
            case "trex", "tyrannosaurus rex", "t-rex" -> 100;
            case "brontosaurus" -> 250;
            case "stegosaurus" -> 150;
            default -> 0;
        };
    }

    public void printProfile(){
        System.out.println("Meet " +
                name + ", a " +
                age + "-year-old " +
                species + ". As a " +
                diet + ", it has a robust weight of " +
                weight + " kilograms." + " They need " +
                (dailyFood) + "kg of food per day which is " +
                (dailyFood/2) + "kg of food per meal.");
    }

    public void isCarnivore(){
        if(Objects.equals(this.diet, "Carnivore")){
            System.out.println(name + " is a " + diet);
        } else {
            System.out.println(name + " is a " + diet);
        }
    }

    public double getDailyFood(){
        return dailyFood;
    }

}

package com.eden.mesozoic;

import java.util.Calendar;

public class ParkInfo {
    final private String mondayToFridayHours = "8:00am to 10:00pm";
    final private String weekendHours = "9:00am to 8:00pm";
    private Calendar day = Calendar.getInstance();

    public String checkParkHours(){
        switch(day.get(Calendar.DAY_OF_WEEK)) {
            case 0, 6 -> {
                return weekendHours;
            }
            default -> {
                return mondayToFridayHours;
            }
        }
    }
}

//dailyFood = switch(species.toLowerCase()){
//        case "trex", "tyrannosaurus rex", "t-rex" -> 100;
//        case "brontosaurus" -> 250;
//        case "stegosaurus" -> 150;
//default -> 0;
//        };
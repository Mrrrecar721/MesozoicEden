package com.eden.mesozoic;

import java.util.Calendar;

public class ParkInfo {
    final private String mondayToFridayHours = "8:00am to 10:00pm";
    final private String weekendHours = "9:00am to 8:00pm";
    final private int guestCount = 0;
    final private int MAX_GUEST_COUNT = 1000;
    private Calendar day = Calendar.getInstance();

    final private double ticketPriceGeneralDay = 39.95;
    final private double ticketPriceGeneralAnnual = 99.95;
    final private double ticketPriceChildDay = 19.95;
    final private double ticketPriceChileAnnual = 69.95;

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

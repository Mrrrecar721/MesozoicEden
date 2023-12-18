package com.eden.mesozoic;



public abstract class Employee {
    private String name;
    private String role;
    private String employeeStatus; // Full or part-time
    private int yearsWorked;
    private String clockIn;
    private String clockedOut;
    private Boolean clockedIn = false;
    private Boolean onBreak = false;
    private Boolean onLunch = false;

    public void clockIn(){
        clockedIn = true;
        System.out.println(name + " has successfully clocked in.");
    }
    public void clockOut(){
        clockedIn = false;
        System.out.println(name + " has successfully clocked out.");
    }
    public void goOnBreak(){
        onBreak = true;
        System.out.println(name + " has successfully clocked out for break.");
    }
    public void backFromBrake(){
        onBreak = false;
        System.out.println(name + " has successfully clocked back in from break.");
    }
    public Boolean isClockedIn(){
        return clockedIn;
    }
    public Boolean isOnBreak(){
        return onBreak;
    }
    public void timeWorked(){

    }
}
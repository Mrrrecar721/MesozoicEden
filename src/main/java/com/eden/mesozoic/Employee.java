package com.eden.mesozoic;



public class Employee {
    private String name;
    private int employeeId;
    private String role;
    private String employeeStatus; // Full or part-time
    private int yearsWorked;
    private String clockIn;
    private String clockedOut;
    private Boolean clockedIn = false;
    private Boolean onBreak = false;
    private Boolean onLunch = false;

    Employee(String name, int employeeId, String role, String employeeStatus){

    }

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

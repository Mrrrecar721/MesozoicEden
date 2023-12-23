package com.eden.mesozoic;


public class Employee {
    private String firstName;
    private String lastName;
    //    private String middleName;
    final private int employeeId;
    private String role; // Janitor, security etc
    private String employeeStatus; // Full or part-time
    private int yearsWorked = 0;
    private Boolean clockedIn = false;
    private Boolean onBreak = false;
    private Boolean onLunch = false;

    Employee(String firstName, String lastName, int employeeId, String role, String employeeStatus) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeId = employeeId;
        this.role = role;
        this.employeeStatus = employeeStatus;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getRole() {
        return role;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeStatus() {
        return employeeStatus;
    }

    public void clockIn() {
        clockedIn = true;
        System.out.println(firstName + " " + lastName + " has successfully clocked in.");
    }

    public void clockOut() {
        clockedIn = false;
        System.out.println(firstName + " " + lastName + " has successfully clocked out.");
    }

    public void goOnBreak() {
        onBreak = true;
        System.out.println(firstName + " " + lastName + " has successfully clocked out for break.");
    }

    public void backFromBrake() {
        onBreak = false;
        System.out.println(firstName + " " + lastName + " has successfully clocked back in from break.");
    }

    public Boolean isClockedIn() {
        return clockedIn;
    }

    public Boolean isOnBreak() {
        return onBreak;
    }

    public void timeWorked() {

    }
    @Override
    public String toString(){
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("First Name = ").append(this.firstName);
        stringBuffer.append("\nLast Name = ").append(this.lastName);
        stringBuffer.append("\nid = ").append(this.employeeId);
        return stringBuffer.toString();
    }
}

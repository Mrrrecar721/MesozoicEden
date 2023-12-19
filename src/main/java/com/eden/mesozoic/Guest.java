package com.eden.mesozoic;

public class Guest {
    private String name;
    private int memberNumber;

    Guest(String name, int memberNumber){
        this.name = name;
        this.memberNumber = memberNumber;
    }

    public String getName() {return name;}
    public int getMemberNumber() {return memberNumber;}
}

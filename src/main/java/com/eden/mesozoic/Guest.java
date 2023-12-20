package com.eden.mesozoic;

public class Guest {
    final private String name;
    final private int memberNumber;
    private Boolean annualMember = false;
    final private String memberStatus = " ";

    Guest(String name, int memberNumber){
        this.name = name;
        this.memberNumber = memberNumber;
    }

    public String getName() {return name;}
    public int getMemberNumber() {return memberNumber;}

    public void annualPurchaseOrRenewal(){
        this.annualMember = true;
    }
}

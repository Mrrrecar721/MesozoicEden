package com.eden.mesozoic;

public class Security extends Employee{
    String securityLevel;
    Boolean hasCheckedCameras = false;


    public void checkCameras(){
        hasCheckedCameras = true;
    }
}

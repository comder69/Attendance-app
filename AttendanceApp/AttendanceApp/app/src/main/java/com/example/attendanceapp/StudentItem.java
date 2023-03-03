package com.example.attendanceapp;

public class StudentItem {
    private String roll;
    private String name;
    private String status;

    public StudentItem(String roll, String name){
        this.roll = roll;
        this.name = name;
        status="";
    }
    public String getRoll(){
        return roll;
    }

    public String getRoll(String roll){
        return null;
    }

    public String getName(){
        return name;
    }

    public String getName(String name){
        this.name = name;
        return name;
    }


    public String getStatus() {
        return status;
    }

    public String getStatus(String status){
        this.status = status;
        return status;
    }
}

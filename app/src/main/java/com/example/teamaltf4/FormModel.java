package com.example.teamaltf4;

public class FormModel {

    private String chemName;
    private String appDate;
    private String areaSprayed;
    private String regNum;
    private int id;

    public String getChemName(){
        return chemName;
    }

    public void setChemName(String chemName){
        this.chemName = chemName;
    }

    public String getAppDate(){
        return appDate;
    }

    public void setAppDate(String appDate){
        this.appDate = appDate;
    }

    public String getAreaSprayed(){
        return areaSprayed;
    }

    public void setAreaSprayed(String areaSprayed){
        this.areaSprayed = areaSprayed;
    }

    public String getRegNum(){
        return regNum;
    }

    public void setRegNum(String regNum){
        this.regNum = regNum;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public FormModel(String chemName, String appDate, String areaSprayed, String regNum){
        this.chemName = chemName;
        this.appDate = appDate;
        this.areaSprayed = areaSprayed;
        this.regNum = regNum;
    }
}

package com.tw.apistackbase.controller;
public class Employee{
    private int employeeID;
    private String sex;
    private String name;
    public Employee(){}
    public Employee(int employeeID,String name,String sex){
        this.employeeID=employeeID;
        this.name=name;
        this.sex=sex;
    }
    public int getEmployeeID(){
        return this.employeeID;
    }
    public String getName(){
        return this.name;
    }

    public String getSex() {
        return sex;
    }

    public String sex(){
        return this.sex;
    }
    public void setEmployeeID(int id){
        this.employeeID=id;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setSex(String sex){
        this.sex=sex;
    }
}
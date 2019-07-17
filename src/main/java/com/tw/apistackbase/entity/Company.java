package com.tw.apistackbase.entity;

import java.util.List;

public class Company{
    private int  companyID;
    private String name;
    private List<Employee> employees;
    public Company(){}
    public Company(int id,String name){
        this.companyID=id;
        this.name=name;
    }
    public Company(int id,List<Employee>employees){
        this.employees=employees;
        this.companyID=id;
    }
    public int getCompanyID(){

        return this.companyID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee>employees){
        this.employees=employees;
   }
}
package com.workintech.developers;

public class SeniorDeveloper extends Employee{
    public SeniorDeveloper(long id,String name, double salary){
        super(id,name,salary);
    }
    public void work(){
        System.out.println("SeniorDeveloper is designing software architecture");
        setSalary(getSalary()+ 700);
    }
}
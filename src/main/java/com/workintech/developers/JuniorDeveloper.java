package com.workintech.developers;

public class JuniorDeveloper extends Employee {
    public JuniorDeveloper(int id,String name,double salary){
        super(id,name,salary);
    }
    @Override
    public void work(){
        setSalary(getSalary()+500);
        System.out.println(getName() + " is a Junior Developer and is now working. New salary: " + getSalary());

    }
}

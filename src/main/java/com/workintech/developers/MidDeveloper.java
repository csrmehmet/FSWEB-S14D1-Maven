package com.workintech.developers;

public class MidDeveloper extends Employee{
    public MidDeveloper(int id,String name,double salary){
        super(id,name,salary);
    }
    @Override
    public void work(){
        setSalary(getSalary()+1000);
        System.out.println(getName() +
                " is a Mid Developer and is now working. New salary: "
                + getSalary());
    }
}

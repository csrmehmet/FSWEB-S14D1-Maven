package com.workintech.developers;

public class SeniorDeveloper extends  Employee{
    public SeniorDeveloper(int id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        setSalary(getSalary() + 2000);
        System.out.println(getName() + " is a Senior Developer and is now working. New salary: " + getSalary());
    }
}

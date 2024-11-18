package com.workintech.cylinder;

public class Circle {
    private  double radius;// radius double olacak

    public  Circle(double radius){
        this.radius=(radius<0)? 0:radius;
    }

    public double getRadius() {
        return radius;
    }
    public double getArea(){
        return (radius*radius*Math.PI);
    }

}

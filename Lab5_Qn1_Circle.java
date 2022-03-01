package Lab_5;

import java.lang.Math;

public class Lab5_Qn1_Circle extends Lab5_Qn1_GeometricObject {
    private double radius;

    public Lab5_Qn1_Circle(){
    }

    public Lab5_Qn1_Circle(double radius) {
        this.radius = radius;
    }

    public Lab5_Qn1_Circle(String color, boolean filled, double radius) {
        //Referencing variables from super class
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return (Math.PI * Math.pow(radius, 2));
    }

    public double getPerimeter() {
        return (2 * Math.PI * radius);
    }

    public double getDiameter() {
        return (radius * 2);
    }

    public void printCircle() {
        
    }

    
}

package Lab_5;

public class Lab5_Qn1_Rectangle extends Lab5_Qn1_GeometricObject{
    private double width;
    private double height;

    public Lab5_Qn1_Rectangle(){
        
    }

    public Lab5_Qn1_Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public Lab5_Qn1_Rectangle(String color, boolean filled, double width, double height) {
        //Referencing variables from super class
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return (width * height);
    }

    public double getPerimeter() {
        return ((width * 2) + (height * 2));
    }

}

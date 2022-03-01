package Lab_5;

public class Lab5_Qn1_TestCircleRectangle {
    public static void main (String[] args){
        Lab5_Qn1_Circle circle = new Lab5_Qn1_Circle(1);
        System.out.println("A circle created on " + circle.getDateCreated());
        System.out.println(circle.toString());
        System.out.println("The colour is " + circle.getColor());
        System.out.println("The radius is " + circle.getRadius());
        System.out.println("The area is " + circle.getArea());
        System.out.println("The diameter is " + circle.getDiameter());

        Lab5_Qn1_Rectangle rectangle = new Lab5_Qn1_Rectangle(2, 4);
        System.out.println("A rectangle created on " + rectangle.getDateCreated());
        System.out.println(rectangle.toString());
        System.out.println("The area is " + rectangle.getArea());
        System.out.println("The perimeter is " + rectangle.getPerimeter());
    }
}

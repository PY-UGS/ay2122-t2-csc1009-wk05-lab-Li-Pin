package Lab_5;

public class Lab5_Qn2_Main {
    public static void main (String[] args){
        Lab5_Qn2_Rectangle r = new Lab5_Qn2_Rectangle(9, 5);
        Lab5_Qn2_Triangle t = new Lab5_Qn2_Triangle(10, 8);
        Lab5_Qn2_Circle c = new Lab5_Qn2_Circle(5, 5);
        Lab5_Qn2_Ellipse e = new Lab5_Qn2_Ellipse(7, 7);
        Lab5_Qn2_Square s = new Lab5_Qn2_Square(6, 6);

        Lab5_Qn2_Shape figref;

        figref = r;
        System.out.println("Inside Area for Rectangle");
        System.out.println("Area is " + figref.area());
        figref = t;
        System.out.println("Inside Area for Triangle");
        System.out.println("Area is " + figref.area());
        figref = c;
        System.out.println("Inside Area for Circle");
        System.out.println("Area is " + figref.area());
        figref = e;
        System.out.println("Inside Area for Ellipse");
        System.out.println("Area is " + figref.area());
        figref = s;
        System.out.println("Inside Area for Square");
        System.out.println("Area is " + figref.area());
    }
}

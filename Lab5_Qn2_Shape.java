package Lab_5;

public abstract class Lab5_Qn2_Shape {
    protected double dim1, dim2;
    protected double pi = 3.14;
    public abstract double area();

    public Lab5_Qn2_Shape(double dim1, double dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }    
}

package Lab_5;

public class Lab5_Qn2_Rectangle extends Lab5_Qn2_Shape{

    public Lab5_Qn2_Rectangle(double dim1, double dim2) {
        super(dim1, dim2);
    }

    @Override
    public double area() {
        return (dim1 * dim2);
    }
}

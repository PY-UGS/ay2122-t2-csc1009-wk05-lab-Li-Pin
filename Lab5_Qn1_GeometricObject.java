package Lab_5;

public class Lab5_Qn1_GeometricObject{
    private String color;
    private boolean filled;
    private java.util.Date dateCreated;

    public Lab5_Qn1_GeometricObject(){
        //default value
        this.color = "white";
        this.filled = false;
    }

    public Lab5_Qn1_GeometricObject(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public java.util.Date getDateCreated(){
        dateCreated = new java.util.Date();
        return dateCreated;
    }
    
    public String toString(){
        return ("color: " + getColor() + " and filled: " + isFilled());
    }
}
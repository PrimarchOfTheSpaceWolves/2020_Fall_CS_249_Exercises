package edu.realemj.Exercises13;

public class TestShapes {
    public static void main(String [] args) {
        // Shape s = new Shape();
        Shape c = new Circle();

        if(c instanceof Circle) {
            Circle myCircle = (Circle)c;
            System.out.println("I'm a circle!");
        }

        if(c instanceof Shape) {
            System.out.println("I'm a shape!");
        }

    }
}

package edu.realemj.Exercises09;

public class Circle {
    double radius = 1.0;
    double [] pos = { 0,0 };

    public Circle() {
        // Nothing
    }

    public Circle(double newRadius) {

        setRadius(newRadius);
    }

    public Circle(double [] newPos) {
        // This is a comment
        this(1.0, newPos);
        //pos[0] = newPos[0];
        //pos[1] = newPos[1];
        System.out.println("HOI");
    }

    public Circle(double newRadius,
                  double [] newPos) {
        setRadius(newRadius);
        pos[0] = newPos[0];
        pos[1] = newPos[1];
    }

    public void setRadius(double newRadius) {
        if(newRadius >= 0) {
            radius = newRadius;
        }
    }

    public double getArea() {
        return Math.PI*radius*radius;
    }

    public double getPerimeter() {
        return Math.PI*2.0*radius;
    }
}

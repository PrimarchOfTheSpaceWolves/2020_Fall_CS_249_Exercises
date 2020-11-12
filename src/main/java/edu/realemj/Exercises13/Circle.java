package edu.realemj.Exercises13;

import javafx.geometry.Point2D;

public class Circle extends Shape implements Comparable<Circle> {
    private double radius;

    public Circle() {
        //super();
    }

    public Circle(double radius) {
        //super();
        this.radius = radius;
    }

    public Circle(double radius,
                  boolean filled,
                  Point2D center) {
        super(filled, center);
        this.radius = radius;

        // This works too...
        //this.filled = filled;
        //setCenter(center);

        // NO!: this.center = center;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double r) {
        radius = r;
    }

    @Override
    public String toString() {
        String m = super.toString() + "\n";
        m += "Radius: " + radius;
        return m;
    }

    public static Shape createShape(int x, int y) {
        Shape s = new Circle(6.0, false,
                            new Point2D(x,y));
        return s;
    }

    @Override
    public double getArea() {
        return Math.PI*radius*radius;
    }

    @Override
    public int compareTo(Circle c) {
        final double EPS = 1e-14;

        if(Math.abs(radius - c.radius) <= EPS) {
            // Equal
            return 0;
        }
        else if((radius - c.radius) > EPS) {
            // Greater
            return 1;
        }
        else {
            // Less
            return -1;
        }
    }
}

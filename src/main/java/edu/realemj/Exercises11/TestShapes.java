package edu.realemj.Exercises11;

import javafx.geometry.Point2D;

public class TestShapes {
    public static void main(String [] args) {
        Shape s = new Shape(true,
                        new Point2D(3,5));
        Circle c = new Circle();
        c.setCenter(new Point2D(7,8));
        Circle c2 = new Circle(
                        5.0, true,
                        new Point2D(3,4));

        System.out.println(s.toString());
        System.out.println("MY SHAPE: " + s);

        System.out.println(c);
        System.out.println(c2);

        Shape s2 = Shape.createShape(8,9);
        System.out.println(s2);
        Shape s3 = Circle.createShape(10,11);
        System.out.println(s3);

        printShape(s);
        printShape(c2);

        Shape s4 = new Circle(9.0, false,
                                new Point2D(-4, 7));
        System.out.println(s4.toString());
        double r = ((Circle)s4).getRadius();

        Shape s5 = new Shape();
        double r2 = ((Circle)s5).getRadius();
    }

    public static void printShape(Shape s) {
        Point2D p = s.getCenter();
        System.out.println("Shape at ("
                + p.getX() + "," + p.getY() + ")");
    }
}

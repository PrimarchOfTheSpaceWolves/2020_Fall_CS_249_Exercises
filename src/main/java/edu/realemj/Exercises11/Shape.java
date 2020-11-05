package edu.realemj.Exercises11;

import javafx.geometry.Point2D;

public class Shape {
    protected boolean filled;
    private Point2D center = new Point2D(0,0);

    public Shape() {}

    public Shape(boolean filled,
                 Point2D center) {
        this.filled = filled;
        this.center = center;
    }

    public boolean isFilled() { return filled; }
    public Point2D getCenter() {return center; }
    public void setFilled(boolean f) {
        filled = f;
    }
    public void setCenter(Point2D c) {
        if(c != null) {
            center = c;
        }
    }

    @Override
    public String toString() {
        String m = "";
        m += super.toString() + "\n";
        m += "Position: (";
        m += center.getX() + ", ";
        m += center.getY() + ")" + "\n";
        m += "Filled?: " + filled;
        return m;
    }

    public static Shape createShape(int x, int y) {
        Shape s = new Shape(false,
                        new Point2D(x,y));
        return s;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Shape) {
            Shape s = (Shape)obj;
            boolean otherFilled = s.filled; // s.isFilled();
            Point2D otherCenter = s.center; // s.getCenter();

            return (otherFilled == filled &&
                    center.equals(otherCenter));
        }
        else {
            return false;
        }
    }

    public double getArea() {
        // TODO
        return 0;
    }
}

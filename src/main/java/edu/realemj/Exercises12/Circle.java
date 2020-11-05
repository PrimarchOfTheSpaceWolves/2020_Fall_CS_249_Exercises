package edu.realemj.Exercises12;

public class Circle {
    private double radius;

    public Circle() {}

    public Circle(double radius) throws InvalidRadiusException {
        setRadius(radius);
    }

    public void setRadius(double radius)
        throws InvalidRadiusException {

        if(radius < 0) {
            //throw new IllegalArgumentException("Negative radius!");
            throw new InvalidRadiusException(radius);
        }
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return "Circle with radius " + radius;
    }

    public static void main(String [] args) {

        try {
            Circle c1 = new Circle(5);
            System.out.println(c1);
            Circle c2 = new Circle(-7);
            System.out.println(c2);
            Circle c3 = new Circle(8);
            System.out.println(c3);
        }
        catch(IllegalArgumentException bob) {
            System.out.println("EXCEPTION!");
            System.out.println(bob.getMessage());
            System.out.println(bob);
            bob.printStackTrace();
        }
        catch(InvalidRadiusException r) {
            System.out.println(r);
        }

        System.out.println("Moving right along...");
    }
}

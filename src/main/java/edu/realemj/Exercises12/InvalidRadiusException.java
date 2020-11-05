package edu.realemj.Exercises12;

public class InvalidRadiusException extends Exception {
    private double badRadius;

    public InvalidRadiusException(double radius) {
        super("Invalid radius: " + radius);
        badRadius = radius;
    }

    public double getBadRadius() {
        return badRadius;
    }
}

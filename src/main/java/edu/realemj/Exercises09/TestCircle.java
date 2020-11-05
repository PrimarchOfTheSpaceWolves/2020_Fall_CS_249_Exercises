package edu.realemj.Exercises09;

public class TestCircle {
    public static void main(String [] args) {
        Circle c = new Circle();
        Circle d = new Circle(27);

        double areaC = c.getArea();
        double areaD = d.getArea();

        System.out.println(areaC);
        System.out.println(areaD);
    }
}

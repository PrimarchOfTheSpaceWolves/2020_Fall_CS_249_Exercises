package edu.realemj.Exercises13;

public class TestEdible {
    public static void main(String [] args) {

        Chicken c = new Chicken();
        Apple a = new Apple();

        Edible e = a;

        if(c instanceof Edible) {
            System.out.println("Chicken is edible!");
        }

        if(a instanceof Edible) {
            System.out.println("Apple is edible!");
        }
    }
}

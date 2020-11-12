package edu.realemj.Exercises13;

public class Chicken implements Edible, PhysicsObject {

    public String howToEat() {
        return "Cook thoroughly first";
    }

    public void flip() {
        System.out.println("Flip chicken");
    }
}

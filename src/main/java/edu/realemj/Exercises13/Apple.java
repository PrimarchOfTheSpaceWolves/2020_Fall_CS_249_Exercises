package edu.realemj.Exercises13;

public class Apple implements Edible, PhysicsObject {

    public String howToEat() {
        return "HAVE A BITE????";
    }

    public String tellIfBurnt() {
        return "Skin gets charred";
    }

    public void flip() {
        System.out.println("Toss apple");
    }
}

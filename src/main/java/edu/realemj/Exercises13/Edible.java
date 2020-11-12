package edu.realemj.Exercises13;

public interface Edible {
    String howToEat();

    default void flip() {
        System.out.println("Flip in skillet");
    }

    default String tellIfBurnt() {
        return "If charred";
    }
}

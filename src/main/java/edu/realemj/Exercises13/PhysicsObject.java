package edu.realemj.Exercises13;

public interface PhysicsObject {

    default void flip() {
        System.out.println("Vertical velocity, 180 turn");
    }
}

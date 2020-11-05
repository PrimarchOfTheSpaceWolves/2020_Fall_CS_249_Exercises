package edu.realemj.Exercises09;

public class Person {
    private String name;
    private boolean alive = true;

    public Person(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public boolean isAlive() {
        return alive;
    }

    public void kill() {
        alive = false;
    }
}

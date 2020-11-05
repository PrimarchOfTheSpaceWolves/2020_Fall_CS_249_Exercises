package edu.realemj.Exercises04;

import java.util.Scanner;

public class NPC {
    private String name;
    private String house;

    public void askForName(Scanner input) {
        System.out.println("Enter name:");
        name = input.next();
        System.out.println("Enter house:");
        house = input.next();
    }

    public void sayHello() {
        System.out.println("Well-met! I am "
                        + name + " of House "
                        + house + "!");
    }

    public void shoutHello() {
        System.out.println("HI I'M "
                    + name.toUpperCase()
                    + "!!!!!!!!!!!!");
    }
}

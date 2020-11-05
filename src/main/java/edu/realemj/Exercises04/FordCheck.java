package edu.realemj.Exercises04;

import java.util.Random;

public class FordCheck {
    public static void main(String [] args) {
        long seed = System.currentTimeMillis();
        Random rand = new Random(seed);
        boolean didFord = rand.nextBoolean();

        if(didFord) {
            System.out.println("You got across!");
        }
        else {
            System.out.println("You all drowned!");
        }
    }
}

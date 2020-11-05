package edu.realemj.Exercises04;

import java.util.*;

public class Village {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        NPC mayor = new NPC();
        NPC farmer = new NPC();
        NPC fisherman = new NPC();

        mayor.askForName(input);
        farmer.askForName(input);
        fisherman.askForName(input);

        mayor.sayHello();
        farmer.sayHello();
        fisherman.sayHello();

        fisherman.shoutHello();
    }
}

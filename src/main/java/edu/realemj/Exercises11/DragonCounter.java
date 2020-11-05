package edu.realemj.Exercises11;

import java.util.ArrayList;
import java.util.Scanner;

public class DragonCounter {
    public static void main(String [] args) {
        ArrayList<Monster> allM = new ArrayList<>();

        Monster m = new Monster();
        allM.add(m);
        allM.add(new Monster());

        Dragon d = new Dragon();
        allM.add(d);
        FireDrake f = new FireDrake();
        allM.add(f);
        // NO GOOD: allM.add("HI");

        for(int i = 0; i < allM.size(); i++) {
            Monster tmp = allM.get(i);
            tmp.attack();
            if(tmp instanceof Dragon) {
                Dragon tmpD = (Dragon)tmp;
                System.out.println("** DRAGON!");
            }
        }

        System.out.println("NOISES!!!!");
        for(Monster bob: allM) {
            bob.makeNoise();
        }

        allM.clear();
        //m.attack();

        Scanner input = SystemInputSingleton.getInstance();
        System.out.println("Enter number:");
        int x = input.nextInt();
        System.out.println("You entered " + x);
    }
}

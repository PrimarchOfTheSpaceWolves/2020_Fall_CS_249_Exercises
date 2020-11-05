package edu.realemj.Howdy;

import java.util.Scanner;

public class HowdyPrinter {
    public static void main(String [] args) {
        Pen p = new Pen();
        p.write();
        p.write();
        p.write();
        p.write();
        p.write();
        p.write();

        System.out.println("DO YOU FEEL IN CHARGE?");
        System.out.print("Victory has");
        System.out.print(" defeated you!");
        System.out.println(" <mask noises>");
        System.err.println("ALERT!!!!");

        Pen q = null;
        //q.write();

        if(q != null && q.hasInk()) {
            System.out.println("We can write!");
        }



        boolean sunnySkies = true;
        boolean hotWeather = false;

        if(sunnySkies && hotWeather) {
            System.out.println("Let's go outside!");
        }

        int daysWithoutFood = 2;
        int daysWithoutWater = 0;
        int daysSick = 0;



        boolean isDead = (daysWithoutFood > 10)
                        || (daysWithoutWater > 5)
                        || (daysSick > 20);
        daysWithoutWater = 8;

        isDead = (daysWithoutFood > 10)
                || (daysWithoutWater > 5)
                || (daysSick > 20);


        System.out.println("Death? " + isDead);


        int nums[] = new int[5];
        nums[0] = 6;
        nums[1] = 3;
        nums[2] = 12;
        nums[3] = 81;
        nums[4] = 17;
        // ERROR: nums[5] = 1;

        int index = (int)(5*Math.random());
        System.out.println(index + ": " + nums[index]);

        Scanner myInput = new Scanner(System.in);

        String firstName = myInput.next();
        String lastName = myInput.next();

        System.out.println("Hello " + firstName
                + " of House " + lastName);


        String s = "a";
        s += "b";
        s += "c";
        s += "d";
        System.out.println(s);

    }

    public static String getPassword() {
        return "1234";
    }
}

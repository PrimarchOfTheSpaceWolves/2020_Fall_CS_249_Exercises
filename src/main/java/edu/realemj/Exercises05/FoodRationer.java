package edu.realemj.Exercises05;

import java.util.Scanner;

public class FoodRationer {
    public static void main(String [] args) {
        final double DECENT_RATIONS = 2;

        Scanner inputBob = new Scanner(System.in);

        System.out.println("How many folks?");
        int partyCnt = inputBob.nextInt();

        double totalFood = 0;
        /*
        // While loop version
        System.out.println("How much food do you wish to buy?");
        int foodToBuy = inputBob.nextInt();

        while(foodToBuy != 0) {
            totalFood += foodToBuy;
            if(totalFood < 0) {
                totalFood = 0;
            }
            System.out.println("Total food so far: " + totalFood);
            System.out.println("Purchase more?");
            foodToBuy = inputBob.nextInt();
        }
        System.out.println("TOTAL FOOD: " + totalFood);
        */

        // Do-while version
        int foodToBuy = 0;
        do {
            System.out.println("How much food do you wish to buy?");
            foodToBuy = inputBob.nextInt();
            totalFood += foodToBuy;
            if(totalFood < 0) {
                totalFood = 0;
            }
            System.out.println("Total food so far: " + totalFood);
        } while(foodToBuy != 0);

        double foodPerDay = partyCnt*DECENT_RATIONS;

        int daysOnTrail = 0;

        while(totalFood > 0 && daysOnTrail < 150) {
            totalFood -= foodPerDay;
            if(totalFood < 0) {
                totalFood = 0;
            }

            daysOnTrail++;

            System.out.println("DAY " + daysOnTrail
                                + ": " + totalFood
                                + " food left");
        }

        System.out.println("Days survived: " + daysOnTrail);

        if(daysOnTrail == 150) {
            System.out.println("MADE IT TO OREGON!!!");
        }
        else {
            System.out.println("Your bones littered the wilderness.");
        }
    }
}

package edu.realemj.Exercises06;

import java.util.Scanner;

public class FoodRationer {

    public static int askAboutParty(Scanner inputBob) {
        System.out.println("How many folks?");
        int partyCnt = inputBob.nextInt();
        return partyCnt;
    }

    public static double buyFood(Scanner inputBob, double totalFood) {
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

        return totalFood;
    }

    public static void main(String [] args) {
        final double DECENT_RATIONS = 2;

        Scanner inputBob = new Scanner(System.in);

        int partyCnt = askAboutParty(inputBob);

        double totalFood = 0;

        totalFood = buyFood(inputBob, totalFood);

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

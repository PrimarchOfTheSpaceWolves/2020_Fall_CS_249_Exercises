package edu.realemj.Exercises06;

import java.util.Scanner;

public class SimpleOregonTrail {

    final static double DECENT_RATIONS = 2;
    final static int TRAIL_LENGTH = 2000;

    public static void main(String [] args) {

        Scanner inputBob = new Scanner(System.in);

        int partyCnt = FoodRationer.askAboutParty(inputBob);

        double totalFood = 0;
        totalFood = FoodRationer.buyFood(inputBob, totalFood);

        int daysOnTrail = 0;

        int wagonSpeed = 15; //200;
        int distanceTraveled = 0;

        do {
            System.out.println("** DAY " + (daysOnTrail+1));
            if(askToForage(inputBob)) {
                totalFood += forageForFood(partyCnt);
            }
            else {
                distanceTraveled += wagonSpeed;
                distanceTraveled = (distanceTraveled > TRAIL_LENGTH) ? TRAIL_LENGTH : distanceTraveled;
            }

            totalFood = eatForDay(  partyCnt,
                                    DECENT_RATIONS,
                                    totalFood);
            daysOnTrail++;

            printCurrentStatus(partyCnt, daysOnTrail,
                                totalFood, distanceTraveled);

        } while(!isGameOver(distanceTraveled, totalFood, partyCnt));

        if(wonGame(distanceTraveled, totalFood, partyCnt)) {
            System.out.println("YOU SURVIVED!!!");
        }
        else {
            System.out.println("YOU ALL PERISHED...HORRIBLY!");
        }
    }

    public static boolean askToForage(Scanner input) {
        System.out.println("Do you wish to forage? [y/n]");
        char ans = input.next().charAt(0);
        return (ans == 'y');
    }

    public static int forageForFood(int partyCnt) {
        int foundFood = (int)(Math.random()*31);
        System.out.println("Found " + foundFood + " food!");
        return foundFood;
    }

    public static double eatForDay(  int partyCnt,
                                     double rations,
                                     double totalFood) {
        double foodForDay = partyCnt*rations;
        totalFood -= foodForDay;
        totalFood = (totalFood < 0) ? 0 : totalFood;
        return totalFood;
    }

    public static void printCurrentStatus(int partyCnt,
                                          int daysOnTrail,
                                          double totalFood,
                                          int distanceTraveled) {
        System.out.println("Status on Day " + daysOnTrail);
        System.out.println("Party count: " + partyCnt);
        System.out.println("Total food: " + totalFood);
        System.out.println("Distance traveled: " + distanceTraveled);
        System.out.println("****************************");
    }

    public static boolean isGameOver(int distanceTraveled,
                                     double totalFood,
                                     int partyCnt) {
        return (wonGame(distanceTraveled, totalFood, partyCnt)
                || lostGame(distanceTraveled, totalFood, partyCnt));

    }

    public static boolean lostGame(int distanceTraveled,
                                  double totalFood,
                                  int partyCnt) {
        return (distanceTraveled < TRAIL_LENGTH && totalFood <= 0);
    }

    public static boolean wonGame(int distanceTraveled,
                                     double totalFood,
                                     int partyCnt) {

        return (distanceTraveled >= TRAIL_LENGTH);
    }
}

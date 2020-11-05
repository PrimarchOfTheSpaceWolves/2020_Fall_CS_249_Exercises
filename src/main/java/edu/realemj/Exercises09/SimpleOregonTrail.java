package edu.realemj.Exercises09;

import edu.realemj.Exercises06.FoodRationer;

import java.util.Scanner;

public class SimpleOregonTrail {

    final static int TRAIL_LENGTH = 2000;

    public static void main(String [] args) {

        SuppliesState supplies = new SuppliesState();

        Scanner inputBob = new Scanner(System.in);

        PartyState party = PartyState.askForParty(inputBob);

        supplies.addToFood(FoodRationer.buyFood(inputBob, 0));

        int daysOnTrail = 0;

        int wagonSpeed = 15; //200;
        int distanceTraveled = 0;

        do {
            System.out.println("** DAY " + (daysOnTrail+1));
            if(askToForage(inputBob)) {
                supplies.addToFood(forageForFood(party.getPartyCnt()));
            }
            else {
                distanceTraveled += wagonSpeed;
                distanceTraveled = (distanceTraveled > TRAIL_LENGTH) ? TRAIL_LENGTH : distanceTraveled;
            }

            //totalFood = eatForDay(  partyCnt,
            //                        DECENT_RATIONS,
            //                        totalFood);
            if(!supplies.eatFoodForDay(party.getPartyCnt())) {
                System.out.println("There wasn't enough food!");
            }
            daysOnTrail++;

            printCurrentStatus(party.getPartyCnt(), daysOnTrail,
                                supplies.getTotalFood(),
                                distanceTraveled);

        } while(!isGameOver(distanceTraveled,
                            supplies, party));

        if(wonGame(distanceTraveled, supplies, party)) {
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
                                     SuppliesState supplies,
                                     PartyState party) {
        return (wonGame(distanceTraveled, supplies, party)
                || lostGame(distanceTraveled, supplies, party));

    }

    public static boolean lostGame(int distanceTraveled,
                                   SuppliesState supplies,
                                   PartyState party) {
        return (distanceTraveled < TRAIL_LENGTH
                && supplies.isOutOfFood());
    }

    public static boolean wonGame(int distanceTraveled,
                                  SuppliesState supplies,
                                  PartyState party) {

        return (distanceTraveled >= TRAIL_LENGTH);
    }
}

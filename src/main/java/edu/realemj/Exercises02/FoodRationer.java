package edu.realemj.Exercises02;

import java.util.Scanner;

public class FoodRationer {
    public static void main(String [] args) {
        final double DECENT_RATIONS = 2;
        //double foodPerPersonPerDay = 2;

        Scanner inputBob = new Scanner(System.in);

        //int partyCnt = 6;
        System.out.println("How many folks?");
        int partyCnt = inputBob.nextInt();

        System.out.println("How much food do you wish to buy?");
        double totalFood = inputBob.nextDouble();
        //double totalFood = 150;

        double foodPerDay = partyCnt*DECENT_RATIONS;
        double daysSurvived = totalFood / foodPerDay;

        System.out.println("Days Left: " + daysSurvived);

    }
}

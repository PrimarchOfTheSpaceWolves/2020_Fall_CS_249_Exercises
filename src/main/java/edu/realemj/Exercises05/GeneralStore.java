package edu.realemj.Exercises05;

import java.util.*;

public class GeneralStore {
    public static void main(String [] args) {
        // Three items: food bullets axles
        int totalFood = 0;
        int totalBullets = 0;
        int totalAxles = 0;

        Scanner inputDude = new Scanner(System.in);

        // Enter something like: 15 food
        boolean isValidItem = true;

        do {
            System.out.println("What do you wish to buy?");
            int cnt = inputDude.nextInt();
            String item = inputDude.next();
            item = item.toLowerCase();

            switch(item) {
                case "food":
                    totalFood += cnt;
                    totalFood = (totalFood < 0) ? 0 : totalFood;
                    break;
                case "axles":
                case "axle":
                    totalAxles += cnt;
                    totalAxles = (totalAxles < 0) ? 0 : totalAxles;
                    break;
                case "bullets":
                case "bullet":
                    totalBullets += cnt;
                    totalBullets = (totalBullets < 0) ? 0 : totalBullets;
                    break;
                default:
                    isValidItem = false;
                    break;
            }

            System.out.println("CURRENT INVENTORY:");
            System.out.println("Total food: " + totalFood);
            System.out.println("Total axles: " + totalAxles);
            System.out.println("Total bullets: " + totalBullets);

        } while(isValidItem);

    }
}

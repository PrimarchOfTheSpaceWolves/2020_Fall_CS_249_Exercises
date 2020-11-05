package edu.realemj.Exercises09;

import java.util.Scanner;

public class Forest {
    public static void main(String [] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter leaves:");
        int leafCnt = input.nextInt();

        Tree pine = new Tree("Pine",
                        true,
                        leafCnt);
        Tree maple = new Tree("Maple",
                        false,
                                1000);
        String pineName = pine.getName();
        System.out.println(pineName);
        System.out.println(pine.getIsConifer());

        System.out.println(maple.getName());

        System.out.println(maple);
        System.out.println(pine);

        Leaf myLeaf = maple.getLeaf(457);
        System.out.println(myLeaf);
        // ERROR: Leaf yourLeaf = maple.getLeaf(5900);
        //System.out.println(yourLeaf);

    }
}

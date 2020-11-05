package edu.realemj.Exercises07;

import java.util.*;

public class OrganTrail {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        String [] persons = new String[4];

        for(int i = 0; i < persons.length; i++) {
            System.out.println("Enter name for person " + i + ":");
            String name = input.nextLine();
            persons[i] = name;
        }

        System.out.println("CAST:");
        for(String crewMember: persons) {
            System.out.println("- " + crewMember);
        }

        String [] disasters = { "a broken leg", "dysentery",
                                "been bitten by a walker",
                                "had a bat meet their face"};

        int pIndex = (int)(Math.random()*persons.length);
        int dIndex = (int)(Math.random()*disasters.length);

        System.out.println(persons[pIndex]
                + " has " + disasters[dIndex]);

    }
}

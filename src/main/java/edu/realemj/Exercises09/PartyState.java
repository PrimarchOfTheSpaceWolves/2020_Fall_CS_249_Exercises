package edu.realemj.Exercises09;

import java.util.Scanner;

public class PartyState {
    private Person [] party;

    public PartyState(String [] names) {
        party = new Person[names.length];
        for(int i = 0; i < party.length; i++) {
            party[i] = new Person(names[i]);
        }
    }

    public void printAlive() {
        System.out.println("PARTY:");
        for(Person p: party) {
            if(p.isAlive()) {
                System.out.println("- " + p.getName());
            }
        }
        /*
        for(int i = 0; i < party.length; i++) {
            if(party[i].isAlive()) {
                System.out.println("- " + party[i].getName());
            }
        }
         */
    }

    public int getPartyCnt() {
        int cnt = 0;
        for(Person p: party) {
            if (p.isAlive()) {
                cnt++;
            }
        }
        return cnt;
    }

    public boolean areAnyAlive() {
        boolean anyAlive = false;
        for(Person p: party) {
            if(p.isAlive()) {
                anyAlive = true;
                break;
            }
        }
        return anyAlive;
    }

    public String killRandom() {
        if(areAnyAlive()) {
            int deadDude = -1;
            do {
                int index = (int)(Math.random()*party.length);
                if(party[index].isAlive()) {
                    party[index].kill();
                    deadDude = index;
                }
            }while(deadDude == -1);
            return party[deadDude].getName();
        }
        else {
            return "Nobody";
        }
    }

    public static PartyState askForParty(Scanner input) {
        System.out.println("How many people?");
        int partyCnt = input.nextInt();
        String [] names = new String[partyCnt];
        for(int i = 0; i < partyCnt; i++) {
            System.out.println("Enter name for person " + (i+1));
            names[i] = input.next();
        }
        PartyState party = new PartyState(names);
        party.printAlive();
        return party;
    }
}


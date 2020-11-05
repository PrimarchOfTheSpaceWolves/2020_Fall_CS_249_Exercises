package edu.realemj.Exercises09;

public class NPCTest {
    public static void main(String [] args) {
        NPC bobObject = new NPC("Bob");
        System.out.println(bobObject.getName());

        NPC joeObject = new NPC("Joe");
        System.out.println(joeObject.getName());

        joeObject.setStrength(100);
        System.out.println(joeObject.getStrength());
        joeObject.setStrength(50);
        System.out.println(joeObject.getStrength());

        System.out.println(bobObject.getStrength());
    }
}

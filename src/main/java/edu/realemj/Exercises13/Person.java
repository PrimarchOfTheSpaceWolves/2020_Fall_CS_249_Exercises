package edu.realemj.Exercises13;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class Person implements Comparable<Person> {
    private String name;
    private boolean alive = true;

    public Person(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public boolean isAlive() {
        return alive;
    }

    public void kill() {
        alive = false;
    }

    public String toString() {
        String s = name;
        if(!alive) {
            s += " (deceased)";
        }
        return s;
    }

    public int compareTo(Person p) {
        if(!alive && p.alive) {
            return -1;
        }
        else if(alive && !p.alive) {
            return 1;
        }
        else {
            return name.compareTo(p.name);
        }
    }

    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        Person [] folks = new Person[5];

        String line = "";
        for(int i = 0; i < folks.length; i++) {
            System.out.println("Enter name:");
            line = input.nextLine();

            boolean alive = ((int)(Math.random()*2)) > 0;
            Person p = new Person(line);
            if(!alive) {
                p.kill();
            }
            folks[i] = p;
        }

        System.out.println("FOLKS:");
        for(Person p: folks) {
            System.out.println("- " + p);
        }

        Arrays.sort(folks);

        System.out.println("SORTED FOLKS:");
        for(Person p: folks) {
            System.out.println("- " + p);
        }
    }
}

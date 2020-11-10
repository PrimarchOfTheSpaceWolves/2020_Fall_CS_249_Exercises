package edu.realemj.Exercises13;

import java.util.Scanner;

public class SystemInputSingleton {
    // EAGER: private static Scanner input = new Scanner(System.in);
    private static Scanner input;

    private SystemInputSingleton() {}

    public static Scanner getInstance() {
        if(input == null) {
            input = new Scanner(System.in);
        }

        return input;
    }
}

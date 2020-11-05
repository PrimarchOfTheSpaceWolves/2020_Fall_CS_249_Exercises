package edu.realemj.Exercises09;

import java.util.Scanner;

public class Multiline {
    public static void main(String [] args) {

        Scanner input = new Scanner(System.in);

        // TODO: Do while word is empty
        String word = input.nextLine();

        char b = word.charAt(0);


        String m = "";
        String line = "";
        System.out.println("Enter message:");

        do {
            line = input.nextLine();
            if(line.length() != 0) {
                m += line;
                m += "\n";
            }
            //System.out.println("LINE:" + line + "@@@");
            //System.out.println("M:" + m + "@@@");
        }while(line.length() != 0);

        // Fix after the fact
        if(m.length() > 0) {
            m = m.substring(0, m.length() - 1);
        }

        System.out.println(m);
    }
}

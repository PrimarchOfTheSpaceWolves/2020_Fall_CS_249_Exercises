package edu.realemj.Exercises12;

import java.io.IOException;

public class DancesWithExceptions {
    public static void main(String [] args) {
        try {
            doMagic(1);
        }
        catch(Exception e) {
            System.out.println("main: " + e.toString());
        }
    }

    public static void doMagic(int x) throws Exception {
        if(x == 0) {
            throw new Exception("From doMagic()");
        }

        try {
            doSorcery(x);
        }
        catch(IOException e) {
            System.out.println("doMagic: " + e.toString());
        }
    }

    public static void doSorcery(int x) throws IOException,Exception {
        if(x == 3) {
            throw new IOException("From doSorcery()");
        }

        if(x == 5) {
            throw new Exception("From doSorcery()");
        }
    }
}

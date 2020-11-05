package edu.realemj.Howdy;

public class Pen {
    private int inkLevel = 90;

    public void write() {
        if(hasInk()) {
            inkLevel -= 20;
            System.out.println("I'M DOING IT!!!");
        }
        else {
            System.out.println("OUT OF INK!");
        }

        if(inkLevel < 0) {
            inkLevel = 0;
        }
    }

    public boolean hasInk() {
        return (inkLevel > 0);
    }

    public static void main(String [] args) {
        System.out.println("PEN!!!!");
    }
}

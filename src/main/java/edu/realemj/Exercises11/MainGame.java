package edu.realemj.Exercises11;

import java.util.ArrayList;

public class MainGame {
    public static void main(String [] args) {
        MessageScreen end = new MessageScreen(
                "YOU DIED", null);
        MessageScreen start = new MessageScreen(
                "WELCOME TO OREGON TRAIL!",null);

        end.setNextScreen(start);
        start.setNextScreen(end);

        Screen current = start;
        while(true) {
            current.draw();
            current = current.waitForInput();
        }
    }
}

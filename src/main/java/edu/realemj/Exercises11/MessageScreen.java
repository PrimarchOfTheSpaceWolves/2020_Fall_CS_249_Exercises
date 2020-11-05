package edu.realemj.Exercises11;

import java.util.Scanner;

public class MessageScreen extends Screen {
    private String textToDisplay;
    private Screen screenAfter;

    public MessageScreen(String textToDisplay,
                         Screen screenAfter) {
        this.textToDisplay = textToDisplay;
        this.screenAfter = screenAfter;
    }

    public void setNextScreen(Screen s) {
        screenAfter = s;
    }

    public void draw() {
        System.out.println(textToDisplay);
        System.out.println("[ENTER any key to continue...]");
    }

    public Screen waitForInput() {
        Scanner input = SystemInputSingleton.getInstance();
        String s = input.next();
        return screenAfter;
    }
}

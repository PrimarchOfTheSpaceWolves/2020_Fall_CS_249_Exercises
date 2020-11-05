package edu.realemj.Exercises12;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Division {
    public static int quotient(int n1, int n2) throws IOException {
        if(n2 == 0) {
            throw new ArithmeticException("Cannot divide by zero!");
            //throw new IOException("HELP");
        }


        int ans = n1 / n2;
        return ans;

        /*
        if(n2 != 0) {
            int ans = n1 / n2;
            return ans;
        }
        else {
            System.err.println("DIVIDETH NOT BY ZERO!");
            return 0;
        }
         */
    }

    public static void main(String [] args) {


        try {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter two numbers:");
            int q1 = input.nextInt();
            int q2 = input.nextInt();

            int result = quotient(q1, q2);
            System.out.println(result);
        }
        catch(ArithmeticException e) {
            System.out.println("YOU FOOL! WHAT HAVE YOU DONE?");
        }
        catch(InputMismatchException e) {
            System.out.println("WHAT IS THIS NONSENSE???");
        }
        catch(IOException e) {
            System.out.println("HUH?");
        }

        System.out.println("Life goes on...");
    }
}

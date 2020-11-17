package edu.realemj.Array2D;

import java.util.Arrays;

public class EnterTheMatrix {
    public static void main(String [] args) {
        Matrix M = Matrix.createTranslate(-5,13);
        Matrix V = new Matrix(3, 1);
        V.set(0,0, 7);
        V.set(1,0, 8);
        V.set(2, 0, 1);

        Matrix W = M.multiply(V);

        System.out.println("M:");
        System.out.println(M);

        System.out.println("V:");
        System.out.println(V);

        System.out.println("W:");
        System.out.println(W);
    }
}

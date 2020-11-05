package edu.realemj.Exercises08;

import java.util.Arrays;

public class LinAlg {
    public static double [][] createTranslate(double offX,
                                              double offY) {
        double [][] T = new double[3][3];
        T[0][0] = T[1][1] = T[2][2] = 1.0;
        T[0][2] = offX;
        T[1][2] = offY;
        return T;
    }

    public static void multiplyMat(double [][] M,
                                    double [] V,
                                    double [] W) {
        for(int i = 0; i < M.length; i++) {
            double s = 0;

            for(int j = 0; j < M[i].length; j++) {
                double val = M[i][j]*V[j];
                s += val;
            }

            W[i] = s;
        }
    }

    public static void main(String [] args) {
        double [][] M = createTranslate(-5,13);
        double [] V = { 7, 8, 1};
        double [] W = new double[3];
        multiplyMat(M, V, W);

        System.out.println("M:");
        for(double [] r: M) {
            System.out.println(Arrays.toString(r));
        }
        System.out.println("V: "
                + Arrays.toString(V));
        System.out.println("W: "
                + Arrays.toString(W));
    }
}

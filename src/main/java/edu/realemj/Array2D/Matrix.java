package edu.realemj.Array2D;

import java.util.Arrays;

public class Matrix {
    private double [][] m;

    public Matrix(int rows, int cols) {
        m = new double[rows][cols];
        for(int i = 0; i < m.length; i++) {
            for(int j = 0; j < m[i].length; j++) {
                if(i == j) {
                    m[i][j] = 1.0;
                }
            }
        }
    }

    public int getRowCnt() {
        return m.length;
    }

    public int getColCnt() {
        return m[0].length;
    }

    public void set(int r, int c, double v) {
        if(r >= 0
                && c >= 0
                && r < getRowCnt()
                && c < getColCnt()) {
            m[r][c] = v;
        }
    }

    public static Matrix createTranslate(double offX,
                                         double offY) {
        Matrix m = new Matrix(3,3);
        m.set(0,2, offX);
        m.set(1,2, offY);
        return m;
    }

    public String toString() {
        String output = "";
        for(int i = 0; i < m.length; i++) {
            for(int j = 0; j < m[i].length; j++) {
                output += m[i][j] + ",";
            }
            output += "\n";
        }
        return output;
    }

    public Matrix multiply(Matrix V) {
        Matrix W = new Matrix(getRowCnt(), V.getColCnt());
        for(int i = 0; i < getRowCnt(); i++) {
            for(int k = 0; k < V.getColCnt(); k++) {
                double s = 0;

                for (int j = 0; j < getColCnt(); j++) {
                    double val = m[i][j] * V.m[j][k];
                    s += val;
                }

                W.m[i][k] = s;
            }
        }
        return W;
    }
}

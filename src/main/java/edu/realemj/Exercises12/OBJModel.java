package edu.realemj.Exercises12;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class OBJModel {
    private ArrayList<Vertex> vertices = new ArrayList<>();
    private ArrayList<Integer> indices = new ArrayList<>();

    public OBJModel() {}

    public void save(String filename) throws IOException {
        try (
            PrintWriter output = new PrintWriter(filename);
        ) {
            for(Vertex v: vertices) {
                output.println("v "
                        + v.getX() + " "
                        + v.getY() + " "
                        + v.getZ());
            }

            for(int i = 0; i < indices.size(); i += 3) {
                int index1 = indices.get(i);
                int index2 = indices.get(i+1);
                int index3 = indices.get(i+2);
                output.println("f "
                                + index1 + " "
                                + index2 + " "
                                + index3);
            }
        }
    }

}

package edu.realemj.Exercises12;

import java.io.File;
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

    public void clear() {
        vertices.clear();
        indices.clear();
    }

    public void scaleY(double factor) {
        for(Vertex v: vertices) {
            v.scaleY(factor);
        }
    }

    public void load(String filename) throws IOException {
        try (
            Scanner inputFile = new Scanner(new File(filename));
        ) {
            clear();

            while(inputFile.hasNextLine()) {
                String line = inputFile.nextLine();
                //System.out.println(line);
                if(line.trim().length() > 0) {
                    Scanner lineScan = new Scanner(line);
                    String flag = lineScan.next();
                    //System.out.println(flag);

                    if(flag.equals("v")) {
                        // Vertex
                        double x = lineScan.nextDouble();
                        double y = lineScan.nextDouble();
                        double z = lineScan.nextDouble();
                        Vertex v = new Vertex(x,y,z);
                        vertices.add(v);
                    }
                    else if(flag.equals("f")) {
                        // Face
                        int i1 = lineScan.nextInt();
                        int i2 = lineScan.nextInt();
                        int i3 = lineScan.nextInt();
                        indices.add(i1);
                        indices.add(i2);
                        indices.add(i3);
                    }
                }
            }
        }
    }

    public static void main(String [] args) {
        try {
            OBJModel bunny = new OBJModel();
            bunny.load("bunny.obj");
            bunny.scaleY(2.0);
            bunny.save("bunnyStretched.obj");
        }
        catch(Exception e) {
            System.err.println(e);
            //e.printStackTrace();
        }
    }
}

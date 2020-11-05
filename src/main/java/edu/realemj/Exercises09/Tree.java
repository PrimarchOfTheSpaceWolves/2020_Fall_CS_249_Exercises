package edu.realemj.Exercises09;

public class Tree {
    private String name;
    private boolean isConifer;
    private Leaf[] allLeaves;

    public Tree(String name,
                boolean isConifer,
                int leafCnt) {
        this.name = name;
        this.isConifer = isConifer;
        allLeaves = new Leaf[leafCnt];
        for(int i = 0; i < allLeaves.length; i++) {
            allLeaves[i] = new Leaf();
        }
    }

    public Leaf getLeaf(int index) {
        return allLeaves[index];
    }

    public String getName() {
        return name;
    }

    public boolean getIsConifer() {
        return isConifer;
    }

    public String toString() {
        String m = "Hello, I am a " + name + "!";
        if(isConifer) {
            m += " MY LEAVES ARE ETERNAL.";
        }
        else {
            m += " Autumn is the herald of death for our kind.";
        }

        return m;
    }
}

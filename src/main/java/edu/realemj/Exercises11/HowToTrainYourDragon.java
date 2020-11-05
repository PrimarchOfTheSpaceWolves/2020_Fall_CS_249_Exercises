package edu.realemj.Exercises11;

public class HowToTrainYourDragon {
    public static void main(String [] args) {
        Monster m = new FireDrake();
        m.attack();
        m.makeNoise();
        m.move();

        if(m instanceof FireDrake) {
            System.out.println("FIREDRAKE!");
            ((FireDrake) m).breatheFire();
            FireDrake f = (FireDrake) m;
            f.breatheFire();
        }

        if(m instanceof Dragon) {
            System.out.println("DRAGON!");
            Dragon d = (Dragon) m;
        }

    }
}

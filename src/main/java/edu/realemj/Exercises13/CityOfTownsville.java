package edu.realemj.Exercises13;

public class CityOfTownsville {
    public static void main(String [] args) {
        MetaHuman clark = new Superhero();
        MetaHuman brainiac = new Supervillain();

        System.out.println(clark.howDoTheyFight());
        System.out.println(clark.howDoTheyFly());

        System.out.println(brainiac.howDoTheyFight());
        System.out.println(brainiac.howDoTheyFly());

    }
}

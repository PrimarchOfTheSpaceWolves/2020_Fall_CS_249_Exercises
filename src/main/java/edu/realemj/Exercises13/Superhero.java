package edu.realemj.Exercises13;

public class Superhero extends MetaHuman {
    public String howDoTheyFly() {
        return "heroically";
    }

    public String howDoTheyFight() {
        return super.howDoTheyFight() + " for truth and justice";
    }

}

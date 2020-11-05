package edu.realemj.Exercises09;

public class SuppliesState {
    private final static double DECENT_RATIONS = 2.0;
    private double totalFood = 0;

    public SuppliesState() {}

    public double getTotalFood() {
        return totalFood;
    }

    public void addToFood(double food) {
        if(food >= 0) {
            totalFood += food;
        }
        else {
            System.err.println("Warning: cannot add negative food!");
        }
    }

    public boolean eatFoodForDay(int partyCnt) {
        double foodForDay = partyCnt*DECENT_RATIONS;
        totalFood -= foodForDay;

        if(totalFood < 0) {
            totalFood = 0;
            return false;
        }

        return true;
    }

    public boolean isOutOfFood() {
        final double EPS = 1e-6;
        return (totalFood < EPS);
    }
}

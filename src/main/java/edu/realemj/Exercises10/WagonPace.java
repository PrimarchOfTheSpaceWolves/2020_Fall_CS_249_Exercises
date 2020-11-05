package edu.realemj.Exercises10;

public enum WagonPace {
    SLOW(7),
    NORMAL(15),
    FAST(18);

    private int milesPerDay;

    private WagonPace(int miles) {
        milesPerDay = miles;
    }

    public double getMilesPerDay() {
        return milesPerDay;
    }
}

package com.example;

public class StepTracker{

    private int minStep;
    private int activeDays;
    private int step;
    private int total;
    private int day;
    // private int ;


    public StepTracker(int minStep){
        this.minStep = minStep;
        int step = 0;
        int activeDays = 0;
        int total = 0;
        int day = 0;
    }

    public void addDailySteps(int step) {
        if (step >= minStep){
            activeDays++;
        }
        total += step;
        day++;
    }

    public int activeDays(){
        return activeDays;
    }

    public double averageSteps(){
        if (day == 0){
            return 0;
        }
        return total/day;
    }

}

//write your class implementation here

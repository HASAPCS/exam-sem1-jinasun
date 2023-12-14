package com.example;

public class StepTracker{

    private int minStep;
    private int activeDays;
    private int ab;


    public StepTracker(int minStep){
        this.minStep = minStep;
    }

    public void addDailySteps(int active) {
        minStep += activeDays();

    }

    public int activeDays(){
        return activeDays;
    }


}

//write your class implementation here

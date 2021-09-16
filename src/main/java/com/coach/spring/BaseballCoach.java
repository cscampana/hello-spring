package com.coach.spring;

public class BaseballCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Practice Session";
    }
}

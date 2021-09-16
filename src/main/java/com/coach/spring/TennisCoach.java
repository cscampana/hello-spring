package com.coach.spring;

public class TennisCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Let's hit some forehands";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}

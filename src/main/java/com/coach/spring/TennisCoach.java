package com.coach.spring;

public class TennisCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Let's hit some forehands";
    }
}

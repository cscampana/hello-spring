package com.coach.spring;

public class BaseballCoach implements Coach{
    // Define a private field for the dependency
    private FortuneService fortuneService;
    // Define a constructor for dependency injection
    public BaseballCoach(FortuneService theFortuneService){
         fortuneService = theFortuneService;
    }
    @Override
    public String getDailyWorkout() {
        return "Practice Session";
    }

    @Override
    public String getDailyFortune() {
        // Use my fortuneService to get a fortune.
        return fortuneService.getFortune();
    }
}

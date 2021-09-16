package com.coach.spring;
import java.util.Random;

public class RandomFortuneService implements FortuneService {
    String[] randomFortunes = {"Today is your lucky day!!", "Unlucky day", "Average day"};
    static Random randomNumber = new Random();
    @Override
    public String getFortune() {
        return randomFortunes[randomNumber.nextInt(randomFortunes.length)];
    }
}

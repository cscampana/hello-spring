package com.coach.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");
        CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class);
        // Setter Injection
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());

        // Literal Injection
        System.out.println(theCoach.getEmailAddress());
        System.out.println(theCoach.getTeam());

        context.close();
    }
}

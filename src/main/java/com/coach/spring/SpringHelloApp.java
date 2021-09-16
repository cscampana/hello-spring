package com.coach.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHelloApp {
    public static void main(String[] args) {
        // load spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");
        // retrieve bean from container
        Coach theCoach = context.getBean("myCoach",Coach.class);
        Coach tennisCoach = context.getBean("tennisCoach", Coach.class);
        // Call methods on the bean
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(tennisCoach.getDailyWorkout());
        // close the context
        context.close();
    }
}

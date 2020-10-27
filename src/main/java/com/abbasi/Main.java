package com.abbasi;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Mohammad.Abbasi
 * @created 27/10/2020
 */
public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Coach theCoach = context.getBean("baseBallCoach", Coach.class);
        theCoach.getDailyWork();
        theCoach.getDailyFortune();
        System.out.println(((BaseballCoach) theCoach).getEmail());
    }
}

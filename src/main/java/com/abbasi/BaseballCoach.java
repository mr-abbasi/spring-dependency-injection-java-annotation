package com.abbasi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author Mohammad.Abbasi
 * @created 27/10/2020
 */
@Component("baseBallCoach")
public class BaseballCoach implements Coach {

//    @Autowired
//    @Qualifier("sadFortuneService")
//    private  FortuneService fortuneService;

    //    @Autowired
//    public void setFortuneService(@Qualifier("sadFortuneService") FortuneService fortuneService) {
//        this.fortuneService = fortuneService;
//    }

    private final FortuneService fortuneService;

    @Value("${email}")
    private String email;

    @Autowired
    public BaseballCoach(@Qualifier("happyFortuneService") FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public void getDailyWork() {
        System.out.println("practice 20 minutes batting");
    }

    public void getDailyFortune() {
        this.fortuneService.getFortune();
    }


    public String getEmail() {
        return email;
    }


    @PostConstruct
    public void init() {
        System.out.println("Baseball coach is created");
    }

    @PreDestroy
    public void testDestroy() {
        System.out.println("Baseball coach is destroyed");
    }
}

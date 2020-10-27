package com.abbasi;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author Mohammad.Abbasi
 * @created 27/10/2020
 */
@Component("happyFortuneService")
//@Scope("prototype")
public class HappyFortuneService implements FortuneService {
    @Override
    public void getFortune() {
        System.out.println("Today is your lucky day");
    }

}

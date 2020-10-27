package com.abbasi;

import org.springframework.stereotype.Component;

/**
 * @author Mohammad.Abbasi
 * @created 27/10/2020
 */
@Component("sadFortuneService")
public class SadFortuneService implements FortuneService {
    @Override
    public void getFortune() {
        System.out.println("Today is your bad day");
    }
}

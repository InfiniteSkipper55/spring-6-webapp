package org.skipper.spring6di.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {

    @Override
    public String greetings() {
        return "Hey folks! Greetings!";
    }
}

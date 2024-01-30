package org.skipper.spring6di.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class GreetingServicePrimary implements GreetingService {
    @Override
    public String greetings() {
        return "Greeting from Primary Bean!";
    }
}

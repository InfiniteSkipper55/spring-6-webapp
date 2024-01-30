package org.skipper.spring6di.services;

import org.springframework.stereotype.Service;

@Service("propertyGreetingService")
public class GreetingServicePropertyInjected implements GreetingService {
    @Override
    public String greetings() {
        return "Greetings from Property Injected Bean!";
    }
}

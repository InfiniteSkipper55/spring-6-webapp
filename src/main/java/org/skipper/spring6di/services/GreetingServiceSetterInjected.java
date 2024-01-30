package org.skipper.spring6di.services;

import org.springframework.stereotype.Service;

@Service("setterGreetings")
public class GreetingServiceSetterInjected implements GreetingService {
    @Override
    public String greetings() {
        return "Greetings from Setter Injected Bean!";
    }
}

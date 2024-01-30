package org.skipper.spring6di.controllers;

import org.skipper.spring6di.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {
    @Qualifier("propertyGreetingService")
    @Autowired
    GreetingService greetingService;

    public String printString() {
        return greetingService.greetings();
    }
}

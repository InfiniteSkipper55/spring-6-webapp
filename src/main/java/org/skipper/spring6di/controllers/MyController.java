package org.skipper.spring6di.controllers;

import org.skipper.spring6di.services.GreetingService;
import org.skipper.spring6di.services.GreetingServiceImpl;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    private final GreetingService greetingService;

    public MyController() {
        // This is just a demonstration if we are not using Spring Framework / Dependency Injection and using
        // an external dependency
        this.greetingService = new GreetingServiceImpl();
    }

    public String printString() {
        System.out.println("In Controller class, printString method.");
        return greetingService.greetings();
    }
}

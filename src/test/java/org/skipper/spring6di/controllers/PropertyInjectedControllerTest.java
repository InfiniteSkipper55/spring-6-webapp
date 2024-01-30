package org.skipper.spring6di.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.skipper.spring6di.services.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PropertyInjectedControllerTest {
    @Autowired
    PropertyInjectedController propertyInjectedController;
//    @BeforeEach
//    void setUp() {
//        propertyInjectedController = new PropertyInjectedController();
//        propertyInjectedController.greetingService = new GreetingServiceImpl();
//    }

    @Test
    void printString() {
        System.out.println(propertyInjectedController.printString());
    }
}
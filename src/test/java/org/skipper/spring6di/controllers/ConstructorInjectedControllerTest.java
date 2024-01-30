package org.skipper.spring6di.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.skipper.spring6di.services.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Service;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ConstructorInjectedControllerTest {
    @Autowired
    ConstructorInjectedController controller;

//    @BeforeEach
//    void setUp() {
//        controller = new ConstructorInjectedController(new GreetingServiceImpl());
//    }

    @Test
    void printString() {
        System.out.println(controller.printString());
    }
}
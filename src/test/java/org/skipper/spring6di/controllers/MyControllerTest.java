package org.skipper.spring6di.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MyControllerTest {

    @Test
    void printString() {
        MyController myController = new MyController();
        System.out.println(myController.printString());
    }
}
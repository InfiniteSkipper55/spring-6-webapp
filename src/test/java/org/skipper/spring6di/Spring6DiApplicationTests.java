package org.skipper.spring6di;

import org.junit.jupiter.api.Test;
import org.skipper.spring6di.controllers.MyController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class Spring6DiApplicationTests {
    
    @Autowired
    ApplicationContext applicationContext;
    
    @Autowired
    MyController controller;

    @Test
    void testAutowireOfController() {
        System.out.println(controller.printString());
    }

    @Test
    void testGetControllerFromCtx() {
        MyController myController = applicationContext.getBean(MyController.class);
        System.out.println(myController.printString());
    }

    @Test
    void contextLoads() {
    }

}

package org.skipper.spring6di.controllers.i18n;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("EN")
@SpringBootTest
class Myi18NControllerENTest {
    @Autowired
    Myi18NController myi18NController;
    @Test
    void printString() {
        System.out.println(myi18NController.printString());
    }
}
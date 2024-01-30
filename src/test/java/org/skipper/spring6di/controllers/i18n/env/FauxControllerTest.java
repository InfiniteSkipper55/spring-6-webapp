package org.skipper.spring6di.controllers.i18n.env;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles({"PROD", "EN"})
@SpringBootTest
class FauxControllerTest {
    @Autowired
    FauxController fauxController;
    @Test
    void dataSource() {
        System.out.println(fauxController.dataSource());
    }
}
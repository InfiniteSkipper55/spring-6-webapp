package org.skipper.spring6di.controllers.i18n.env;

import org.skipper.spring6di.services.FauxService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class FauxController {
    private final FauxService fauxService;

    public FauxController(@Qualifier("i18NEnvService") FauxService fauxService) {
        this.fauxService = fauxService;
    }

    public String dataSource() {
        return fauxService.dataSource();
    }
}

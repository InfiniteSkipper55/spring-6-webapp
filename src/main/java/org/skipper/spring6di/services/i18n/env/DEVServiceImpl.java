package org.skipper.spring6di.services.i18n.env;

import org.skipper.spring6di.services.FauxService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"DEV", "default"})
@Service("i18NEnvService")
public class DEVServiceImpl implements FauxService {
    @Override
    public String dataSource() {
        return "Development Data Source!";
    }

}

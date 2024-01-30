package org.skipper.spring6di.services.i18n.env;

import org.skipper.spring6di.services.FauxService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("PROD")
@Service("i18NEnvService")
public class PRODServiceImpl implements FauxService {
    @Override
    public String dataSource() {
        return "Production Data Source!";
    }
}

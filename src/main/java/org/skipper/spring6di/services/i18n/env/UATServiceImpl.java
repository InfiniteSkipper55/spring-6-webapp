package org.skipper.spring6di.services.i18n.env;

import org.skipper.spring6di.services.FauxService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("UAT")
@Service("i18NEnvService")
public class UATServiceImpl implements FauxService {
    @Override
    public String dataSource() {
        return "User Acceptance Testing Data Source!";
    }
}

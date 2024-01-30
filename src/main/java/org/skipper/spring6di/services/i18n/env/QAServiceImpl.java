package org.skipper.spring6di.services.i18n.env;

import org.skipper.spring6di.services.FauxService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("QA")
@Service("i18NEnvService")
public class QAServiceImpl implements FauxService {
    @Override
    public String dataSource() {
        return "Quality Assurance Data Source!";
    }
}
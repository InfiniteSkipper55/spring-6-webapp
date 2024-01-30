package org.skipper.spring6di.services.i18n;

import org.skipper.spring6di.services.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"EN", "default"})
@Service("i18NService")
public class EnglishGreetingService implements GreetingService {
    @Override
    public String greetings() {
        return "Greetings from EN!";
    }
}

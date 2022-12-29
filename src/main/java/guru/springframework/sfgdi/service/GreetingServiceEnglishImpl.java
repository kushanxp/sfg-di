package guru.springframework.sfgdi.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("EN")
@Service("i18ngreeting")
public class GreetingServiceEnglishImpl implements GreetingService{
    @Override
    public String getGreeting() {
        return "Hello World - English!!";
    }
}

package guru.springframework.sfgdi.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"ES", "default"})
@Service("i18ngreeting")
public class GreetingServiceSpanishImpl implements GreetingService {
    @Override
    public String getGreeting() {
        return "Hola Mundo!!";
    }
}

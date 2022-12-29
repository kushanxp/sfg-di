package guru.springframework.sfgdi.controller;

import guru.springframework.sfgdi.service.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class I18NController {

    private GreetingService greetingService;

    public I18NController(@Qualifier("i18ngreeting") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getMyGreeting() {
        return greetingService.getGreeting();
    }
}

package guru.springframework.sfgdi.controller;

import guru.springframework.sfgdi.service.ConstructorInjectedServiceImpl;
import guru.springframework.sfgdi.service.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {

    private GreetingService greetingService;

    public ConstructorInjectedController(@Qualifier("constructorInjectedServiceImpl") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getMyGreeting() {
        return greetingService.getGreeting();
    }
}

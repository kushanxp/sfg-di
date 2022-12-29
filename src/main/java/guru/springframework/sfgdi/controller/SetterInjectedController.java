package guru.springframework.sfgdi.controller;

import guru.springframework.sfgdi.service.GreetingService;
import guru.springframework.sfgdi.service.SetterInjectedServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {

    private GreetingService greetingService;

    @Qualifier("setterInjectedServiceImpl")
    @Autowired
    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getMyGreeting() {
        return greetingService.getGreeting();
    }
}

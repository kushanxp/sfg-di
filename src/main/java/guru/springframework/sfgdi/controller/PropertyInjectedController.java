package guru.springframework.sfgdi.controller;

import guru.springframework.sfgdi.service.GreetingService;
import guru.springframework.sfgdi.service.PropertyInjectedServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Qualifier("propertyInjectedServiceImpl")
    @Autowired
    private GreetingService greetingService;

    public String getMyGreeting() {
        return greetingService.getGreeting();
    }
}

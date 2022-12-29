package guru.springframework.sfgdi.service;

import org.springframework.stereotype.Service;

@Service
public class SetterInjectedServiceImpl implements GreetingService{

    @Override
    public String getGreeting() {
        return "Hello World - Setter!!";
    }
}

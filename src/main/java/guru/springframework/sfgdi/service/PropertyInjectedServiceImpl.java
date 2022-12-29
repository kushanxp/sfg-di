package guru.springframework.sfgdi.service;

import org.springframework.stereotype.Service;

@Service
public class PropertyInjectedServiceImpl implements GreetingService{

    @Override
    public String getGreeting() {
        return "Hello World - Property!!";
    }
}

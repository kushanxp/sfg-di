package guru.springframework.sfgdi.service;

import org.springframework.stereotype.Service;

@Service
public class ConstructorInjectedServiceImpl implements GreetingService {
    @Override
    public String getGreeting() {
        return "Hello World - Constructor!!";
    }
}

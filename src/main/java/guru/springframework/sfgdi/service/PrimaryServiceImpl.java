package guru.springframework.sfgdi.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class PrimaryServiceImpl implements GreetingService{
    @Override
    public String getGreeting() {
        return "Hello World - Primary Bean!!";
    }
}

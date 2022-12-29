package guru.springframework.sfgdi.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class MyController {

    public String getHello() {
        return "Hello World!!";
    }
}

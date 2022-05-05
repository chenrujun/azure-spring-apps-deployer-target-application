package chenrujun.azure.spring.apps.deployer.application.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "Hello, current time is " + new Date();
    }
}

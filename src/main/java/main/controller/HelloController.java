package main.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// ready for use by spring MVC to handle web requests
@RestController
public class HelloController {

    // maps / to the index() method
    // so when i use "curl http://localhost:8080/" as a get request, we receive "Greetings from Spring Boot!"
    @GetMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
}

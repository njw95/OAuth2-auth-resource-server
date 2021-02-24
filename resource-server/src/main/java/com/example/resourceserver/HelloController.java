package com.example.resourceserver;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping(value = "/public")
    public String publicHello() {
        return "HELLO PUBLIC";
    }

    @GetMapping(value = "/private")
    public String privateHello() {
        return "PRIVATE hello";
    }
}

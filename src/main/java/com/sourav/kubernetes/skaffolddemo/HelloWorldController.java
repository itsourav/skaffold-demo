package com.sourav.kubernetes.skaffolddemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    
    @GetMapping("/hello")
    public String hello() {
        return "Hello Youtube";
    }
}

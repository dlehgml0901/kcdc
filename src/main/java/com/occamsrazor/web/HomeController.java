package com.occamsrazor.web;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootConfiguration
@RestController
public class HomeController {
    @GetMapping("/")
    public String hello() {
        return "index";
    }
    @GetMapping("/home")
    public String home() {
        return "user";
    }
    @GetMapping("/admin")
    public String admin() {
        return "admin";
    }
}

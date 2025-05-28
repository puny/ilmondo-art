package com.java.ilmondo.ilmondo_art.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String hello() {
        String message = "Hello ilmondo ❤❤🧡";
        return message;
    }

    @GetMapping("/sample")
    public String sample() {
        String message = "sample 💥";        
        return message;
    }

    @GetMapping("/dev")
    public String dev() {
        String message = "dev 🤗😎";
        return message;
    }
}

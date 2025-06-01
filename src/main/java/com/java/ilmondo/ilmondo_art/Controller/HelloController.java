package com.java.ilmondo.ilmondo_art.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String hello() {
        String message = "Hello ilmondo ❤❤🧡💕💗💌";
        int num = calc();
        return message;
    }

    @GetMapping("/sample")
    public String sample() {
        String message = "main sample 💥";        
        return message;
    }


    private int calc() {
        return 0;
    }

}

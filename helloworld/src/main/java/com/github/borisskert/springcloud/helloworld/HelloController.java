package com.github.borisskert.springcloud.helloworld;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${helloworld.text:_abc_}")
    private String text;

    @RequestMapping("/hello")
    public String hello() {
        return "Hello cloudy world: " + text;
    }


    @RequestMapping(value = "/")
    public String home() {
        return "Hi!";
    }
}

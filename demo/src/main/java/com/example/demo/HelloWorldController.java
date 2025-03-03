package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;;

@RestController
public class HelloWorldController {

    @RequestMapping("/first")
    public String helloWorld() {
        System.out.println("firstController is running");
        return "Hello World";
    }
}

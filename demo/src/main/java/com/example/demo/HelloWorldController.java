package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;;

@RestController
public class HelloWorldController {

    @RequestMapping("/first")
    public String helloWorld() {
        System.out.println("firstController is running");
        return "Hello World 12344 89yyy9999998yjjj";
    }
}

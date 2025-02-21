package com.spring.springmessagingapp.controller;

import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/hello")
public class HelloRestController {

    // curl localhost:8080/hello
    @RequestMapping(value = {"", "/", "/home"})
    public String sayHello() {
        return "Hello From BridgeLabz!!!";
    }

}

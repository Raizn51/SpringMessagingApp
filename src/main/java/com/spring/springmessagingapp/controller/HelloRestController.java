package com.spring.springmessagingapp.controller;

import com.spring.springmessagingapp.model.User;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/hello")
public class HelloRestController {

    // curl localhost:8080/hello
    @RequestMapping(value = {"", "/", "/home"})
    public String sayHello() {
        return "Hello From BridgeLabz!!!";
    }

    // curl localhost:8080/hello/query?name=Mark -w "\n"
    @GetMapping("/query")
    public String sayHello(@RequestParam(value = "name", defaultValue = "User") String name) {
        return "Hello " + name + " from BridgeLabz!";
    }

    // curl localhost:8080/hello/param/Mark -w "\n"
    @GetMapping("/param/{name}")
    public String sayHelloTo(@PathVariable String name) {
        return "Hello " + name + " from BridgeLabz!";
    }

    // curl -X POST -H "Content-Type: application/json" -d '{"firstName": "Mark", "lastName": "Taylor"}' "http://localhost:8080/hello/post" -w "\n"
    @PostMapping("/post")
    public String sayHello(@RequestBody User user) {
        return "Hello " + user.getFirstName() + " " + user.getLastName() + " from BridgeLabz!";
    }
}

package com.fatec.aula01.helloworld.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Localhost:8080/hello
@RequestMapping("/hello")
public class HelloController {

    @GetMapping
    public String hello(){
        return "Hello, world!";
    }
}

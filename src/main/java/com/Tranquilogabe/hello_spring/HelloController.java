package com.Tranquilogabe.hello_spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class HelloController {

    @GetMapping("/hello")
        public String hello(@RequestParam(defaultValue = "Wolrd") String name){
            return "Hello, " + name + "!";
        }

    }
    


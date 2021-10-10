package com.spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/hello")
    public String get(){
        return "Hello";
    }
    @GetMapping("/")
    public  String get1(){
        return "Welcome";
    }
    @GetMapping("/fuck")
    public  String get2(){
        return "fuck";
    }
}

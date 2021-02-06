package com.example.openshift.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/home")
    public String GetHome(){
        return "Hello from SpringBoot";
    }
}

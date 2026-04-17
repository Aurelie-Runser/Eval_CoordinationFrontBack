package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dtos.HomeResponse;

@RestController
public class HomeController {

    @GetMapping("/")
    public HomeResponse hello() {
        return new HomeResponse("Hello World from Java");
    }
}
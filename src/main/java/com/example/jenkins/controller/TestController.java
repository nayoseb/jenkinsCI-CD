package com.example.jenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/test")
    public String test()
    {
        return "안녕하세요";
    }

    @GetMapping
    public String test2() {
        return "test2";
    }
}

package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("code-space")
public class hello {
    @RequestMapping
    public String helloWorld() {
        return "hello";
    }
}

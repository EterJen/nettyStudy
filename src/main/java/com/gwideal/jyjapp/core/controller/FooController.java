package com.gwideal.jyjapp.core.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController

public class FooController {
    @RequestMapping("/foo")
    public String hello(){
        return "bar";
    }
}


package com.lsl.provider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class FeignProviderController {

    @GetMapping("/pro")
    public String getData(){
        return "hello";
    }
}

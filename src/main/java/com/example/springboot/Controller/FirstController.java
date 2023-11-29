package com.example.springboot.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {

    @GetMapping("/home")
    public String hello(){
        return "home";
    }

    @GetMapping("/out")
    public String outPage(){
        return "out";
    }
}

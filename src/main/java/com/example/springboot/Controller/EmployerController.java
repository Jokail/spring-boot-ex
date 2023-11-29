package com.example.springboot.Controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployerController {

    @GetMapping("/employer")
    public String employerPage(){
        return "employer";
    }

    @GetMapping("/new-employer")
    public String createNewEmployerPage(){
        return "new-employer";
    }

}

package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String homepage(Model model){
        String message "Say hello to the people";
        model.addAtribute("myvar", message);
        return "hometemplate";
    }
}

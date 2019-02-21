package com.example.demo.resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping(value="/login")
    public String lolo(Model model){
        model.addAttribute("msg", "a msg from handler2");
        return "login";
    }
}
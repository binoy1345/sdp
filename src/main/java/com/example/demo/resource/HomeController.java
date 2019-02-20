package com.example.demo.resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @RequestMapping(value="/login")
    public String lolo(Model model){
        System.out.println("--------------------------------\n----------------------------------");
        model.addAttribute("msg", "a msg from handler2");
        return "login";
    }
}
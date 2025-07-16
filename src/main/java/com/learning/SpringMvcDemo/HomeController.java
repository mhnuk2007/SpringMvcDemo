package com.learning.SpringMvcDemo;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
@ModelAttribute("course")
    public String courseName(){
        return "Java";
    }
    @RequestMapping("/")
    public String home() {
        System.out.println("home method called");
        return "index";
    }

    @RequestMapping("addAlien")
    public String add(@ModelAttribute("alien1") Alien alien) {
        return "result";
    }
}

package com.example.demo.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class MainController {
@GetMapping("/")
    public String home(@RequestParam (name = "name", required = false, defaultValue = "Olga") String name, Model model ){
        model.addAttribute("namehtml", name);
        return "home";
    }

//    @GetMapping("/blog")
//    public String blogmain(Model model ){
//        model.addAttribute("blogmain");
//        return "blogmain";
//    }
    @GetMapping("/about")
    public String about(Model model ){
        model.addAttribute("about");
        return "about";
    }
    @GetMapping("/contacts")
    public String contacts(Model model ){
        model.addAttribute("contacts");
        return "contacts";
    }

    @GetMapping("/poems")
    public String poems(Model model ){
        model.addAttribute("poems");
        return "poems";
    }
    @GetMapping("/tales")
    public String tales(Model model ){
        model.addAttribute("tales");
        return "tale";
    }

}

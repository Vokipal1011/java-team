package com.ourcompany.javateam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class MainController {

    @GetMapping
    public String Main(Model model) {

        model.addAttribute("message", "Привет команда Java-team!!!");
        return "index";

    }

}

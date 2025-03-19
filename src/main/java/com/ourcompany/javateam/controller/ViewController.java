package com.ourcompany.javateam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {
    @GetMapping("/blog")
    public String viewController() {
        return"blog";
    }

    @GetMapping("/forus")
    public String ForUsController()
    {
        return "forus";
    }

}

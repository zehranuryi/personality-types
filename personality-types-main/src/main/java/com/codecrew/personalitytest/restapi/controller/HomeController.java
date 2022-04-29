package com.codecrew.personalitytest.restapi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class HomeController {

    @GetMapping("/")
    public RedirectView getSwagger(){
        return new RedirectView("/swagger-ui/index.html");
    }
}

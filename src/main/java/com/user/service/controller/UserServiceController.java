package com.user.service.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserServiceController {

    @GetMapping("/")
    public ModelAndView getHome() {

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("home");

        return modelAndView;
    }

    @GetMapping("/home")
    public ModelAndView getHomePage() {

        ModelAndView homepage = new ModelAndView();
        homepage.setViewName("home");
        return homepage;
    }
}

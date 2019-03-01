package com.cps.www.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("Test")
public class TestController {
    @RequestMapping("test")
    public ModelAndView index(ModelAndView modelAndView) {
        modelAndView.setViewName("test");
        modelAndView.addObject("name", "chenps");
        modelAndView.addObject("age", 10);
        return modelAndView;
    }
}
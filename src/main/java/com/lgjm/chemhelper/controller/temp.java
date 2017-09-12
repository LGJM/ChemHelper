package com.lgjm.chemhelper.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class temp {

    @RequestMapping(value="/qwer", method = RequestMethod.GET)
    public ModelAndView temp36(ModelAndView modelAndView) {
        modelAndView.setViewName("temp");
        modelAndView.addObject("bean", new TempBean());
        return modelAndView;
    }

    @RequestMapping(value = "/temp", method = RequestMethod.POST)
    public String temp37(@Validated TempBean t) {
        System.out.println(t.getT());
        return t.getT();
    }

}

package com.lgjm.chemhelper.controller;

import com.lgjm.chemhelper.dto.FunctionBean;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
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
    public String temp37(@Validated TempBean t) throws Exception {
        System.out.println(t.getT());
        //throw new Exception("LUKE LUKE LUKE");
        return t.getT();
    }

    @RequestMapping(value = "/submit", method = RequestMethod.POST)
    @ResponseBody
    public /*Map<String, Object>*/ String submit(@Validated FunctionBean bean/*, Map<String, Object> model*/) {
        System.out.println("here");
        return "function/shellConfig";
    }

}

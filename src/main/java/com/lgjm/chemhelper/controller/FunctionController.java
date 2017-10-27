package com.lgjm.chemhelper.controller;

import com.lgjm.chemhelper.dto.FunctionBean;
import com.lgjm.chemhelper.dto.ShellConfigBean;
import com.lgjm.chemhelper.function.ChemistryFunction;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
@RequestMapping("/fn")
public class FunctionController {

    /**
     * Handles and redirects all function pages.
     * NOTE: the URL path must be the same as the JSP name and the bean must be page + "Bean"
     *
     * @param page The page from the URL to redirect to, same as JSP name and same in bean name!
     * @return The JSP to return
     */
    @RequestMapping(value = "/{page}", method = RequestMethod.GET)
    public ModelAndView shellConfig(@PathVariable("page") String page, ModelAndView modelAndView) {
        // FIXME don't hardcode package name!
        //String beanName = "com.lgjm.chemhelper.dto." + page.substring(0, 1).toUpperCase() + page.substring(1) + "Bean";
        String className = "com.lgjm.chemhelper.function. "+ page.substring(0, 1).toUpperCase() + page.substring(1);
        try {
            modelAndView.addObject("fnBean", new FunctionBean(   Class.forName("com.lgjm.chemhelper.function.ShellConfig").getClass()   ));//Class.forName(/*beanName*/"com.lgjm.chemhelper.dto.ShellConfigBean").newInstance());
        }
        catch(InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        modelAndView.addObject("bean", new TempBean());
        modelAndView.setViewName("function/" + page);
        return modelAndView;
    }

    @RequestMapping(value = "/temp", method = RequestMethod.POST)
    public String temp37(@Validated FunctionBean t) throws Exception {
        System.out.println("HI");
        //throw new Exception("LUKE LUKE LUKE");
        return "WER";
    }

    @RequestMapping(value = "/temp2", method = RequestMethod.POST)
    public <T extends FunctionBean> String temp38(@ModelAttribute("fnBean") @Validated T t) throws Exception {
        System.out.println("HI");
        //throw new Exception("LUKE LUKE LUKE");
        return "WER";
    }

}

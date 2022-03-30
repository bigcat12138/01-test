package com.tg.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {

    @RequestMapping(value = "/some.do")
    public ModelAndView doSome(){
        ModelAndView mav = new ModelAndView();
        mav.addObject("fun","doSome方法执行了");
        mav.setViewName("back");
        return mav;
    }
}

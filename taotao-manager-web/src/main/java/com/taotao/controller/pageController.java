package com.taotao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class pageController {

    @RequestMapping("/")
    public String showIndex(){
        return "index";
    }
    @RequestMapping("/{pathPage}")
    public String showPage(@PathVariable String pathPage){
        return pathPage;
    }
}

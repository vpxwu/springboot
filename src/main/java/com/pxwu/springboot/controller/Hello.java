package com.pxwu.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.lang.model.element.NestingKind;

@Controller
public class Hello {

    @GetMapping("/hello")
    public String hello(@RequestParam(name ="name",defaultValue ="world",required =false) String name , Model model){
        model.addAttribute("name", name);
        return "hello";
    }
}

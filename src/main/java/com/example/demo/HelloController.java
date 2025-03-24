package com.example.demo;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
@Controller  //注意这里必须为Controller
public class HelloController {

    @RequestMapping("/aiman")
    public String helloHtml() {
        return "index";
    }
}
package com.tecmilenio.evidencia1av.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String index() {
        return "index";
    }
    
    @RequestMapping("/calculaimc")
    public String calculaimc() {
        return "calculaimc";
    }
    
    @RequestMapping("/resultadoimc")
    public String resultadoimc() {
        return "resultadoimc";
    }
}
package com.tecmilenio.evidencia1av.controllers;

import com.tecmilenio.evidencia1av.classes.*;
import com.tecmilenio.evidencia1av.services.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("crear")
public class UserController {

    @Autowired
    private UserService UserService;
    
    @PostMapping
    public String saveUser(
            @RequestParam("nombre") String nombre,
            @RequestParam("apellido") String apellido,
            @RequestParam("edad") String edad,
            @RequestParam("usuario") String usuario,
            @RequestParam("pass") String pass) {

        user user = new user(nombre, apellido, edad, usuario, pass);

        UserService.save(user);

        return "index";
    }
}

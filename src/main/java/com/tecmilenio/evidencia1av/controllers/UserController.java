package com.tecmilenio.evidencia1av.controllers;

import com.tecmilenio.evidencia1av.classes.user;
import com.tecmilenio.evidencia1av.services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("crearUser")
public class UserController {

    @Autowired
    private UserService UserService;
    
    @PostMapping
    public String guardarUser(
            @RequestParam("nombre") String nombre,
            @RequestParam("apellido") String apellido,
            @RequestParam("edad") String edad,
            @RequestParam("usuario") String usuario,
            @RequestParam("pass") String pass) {

        user user = new user(nombre, apellido, edad, usuario, pass);

        UserService.guardar(user);

        return "calculaimc";
    }
}

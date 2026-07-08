package com.tecmilenio.evidencia1av.controllers;

import com.tecmilenio.evidencia1av.classes.imc;
import com.tecmilenio.evidencia1av.services.ImcService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("crearImc")
public class ImcController {

    @Autowired
    private ImcService ImcService;
    
    @PostMapping
    public String guardarImc(
            @RequestParam("peso") String peso,
            @RequestParam("altura") String altura) {
        
        imc imc = new imc(peso, altura, 0);

        ImcService.guardar(imc);

        return "resultadoimc";
    }
}

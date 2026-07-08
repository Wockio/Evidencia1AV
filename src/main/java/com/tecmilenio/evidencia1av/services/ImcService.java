package com.tecmilenio.evidencia1av.services;

import com.tecmilenio.evidencia1av.classes.imc;
import com.tecmilenio.evidencia1av.dao.ImcDAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ImcService {

    @Autowired
    private ImcDAO ImcDAO;
    
    public void guardar(imc imc) {
        imc.calcularImc();
        ImcDAO.insertar(imc);
    }
}
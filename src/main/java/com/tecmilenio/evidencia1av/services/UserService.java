package com.tecmilenio.evidencia1av.services;

import com.tecmilenio.evidencia1av.classes.user;
import com.tecmilenio.evidencia1av.dao.UserDAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService {

    @Autowired
    private UserDAO UserDAO;


    public void guardar(user user) {
        UserDAO.insertar(user);
    }
}
package com.tecmilenio.evidencia1av.services;

import com.tecmilenio.evidencia1av.classes.*;
import com.tecmilenio.evidencia1av.dao.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService {

    @Autowired
    private UserDAO UserDAO;


    public void save(user user) {
        UserDAO.insert(user);
    }
}
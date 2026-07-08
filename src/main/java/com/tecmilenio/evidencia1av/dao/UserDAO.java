package com.tecmilenio.evidencia1av.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.tecmilenio.evidencia1av.classes.user;

@Repository
public class UserDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void insertar(user user) {

        String sql = "INSERT INTO users(nombre, apellido, edad, usuario, pass)"
                + "VALUES (?,?,?,?,?)";

        jdbcTemplate.update(
            sql,
            user.getNombre(),
            user.getApellido(),
            user.getEdad(),
            user.getUsuario(),
            user.getPass()
        );
    }
}
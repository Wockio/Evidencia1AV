package com.tecmilenio.evidencia1av.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.tecmilenio.evidencia1av.classes.imc;

@Repository
public class ImcDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void insertar(imc imc) {

        String sql = "INSERT INTO users(peso, altura, imc)"
                + "VALUES (?,?,?)";

        jdbcTemplate.update(
            sql,
            imc.getPeso(),
            imc.getAltura(),
            imc.getImc()
        );
    }
}
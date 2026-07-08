/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tecmilenio.evidencia1av.classes;

/**
 *
 * @author andre
 */
public class user {
    
    private String nombre;
    private String apellido;
    private int edad;
    private String usuario;
    private String pass;
    
     public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getApellido() {
        return apellido;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
     public int getEdad() {
        return edad;
    }
    
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
     public String getUsuario() {
        return usuario;
    }
    
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
     public String getPass() {
        return pass;
    }
    
    public void setPass(String pass) {
        this.pass = pass;
    }
    
    public user (String nombre, String apellido, String edad, String usuario, 
            String pass){
        this.setNombre(nombre);
        this.setApellido(apellido);
        this.setEdad(Integer.parseInt(edad));
        this.setUsuario(usuario);
        this.setPass(pass);
    }
    
}
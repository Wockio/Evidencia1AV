/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tecmilenio.evidencia1av.classes;

/**
 *
 * @author andre
 */
public class Usuario {
    
    private String nombre;
    private int edad;
    private String usuario;
    private String password;
    
     public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
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
    
     public String getPassword() {
        return password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    public Usuario (String nombre, String edad, String usuario, 
            String password){
        this.setNombre(nombre);
        this.setEdad(Integer.parseInt(edad));
        this.setUsuario(usuario);
        this.setPassword(password);
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tecmilenio.evidencia1av.classes;

/**
 *
 * @author andre
 */
public class imc {
    
    private double peso;
    private double altura;
    private double imc;
    
    public double getPeso() {
        return peso;
    }
    
    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    public double getAltura() {
        return altura;
    }
    
    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public double getImc() {
        return imc;
    }
    
    public void setImc(double imc) {
        this.imc = imc;
    }
        
    public void calcularImc() {
        this.setImc((this.getPeso()/(this.getAltura()*this.getAltura())));
    }
    
    public imc (String peso, String altura, double imc) {
        this.setPeso(Double.parseDouble(peso));
        this.setAltura(Double.parseDouble(altura));
        this.setImc(imc);
    }
}
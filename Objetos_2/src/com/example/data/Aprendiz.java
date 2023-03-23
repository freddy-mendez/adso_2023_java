/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.data;

/**
 *
 * @author Teleinformatica III
 */
public class Aprendiz {
    private long documento;
    private String nombre;

    public Aprendiz(long documento, String nombre) {
        this.documento = documento;
        this.nombre = nombre;
    }

    public long getDocumento() {
        return documento;
    }

    public void setDocumento(long documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Aprendiz{" + "documento=" + documento + ", nombre=" + nombre + '}';
    }
    
    
}

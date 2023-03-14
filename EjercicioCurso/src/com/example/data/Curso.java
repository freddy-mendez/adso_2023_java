package com.example.data;

public class Curso {
    int codigo;
    String nombre;
    String docente;
    int creditos;

    public Curso(int codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public Curso(int codigo, String nombre, String docente) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.docente = docente;
    }

    public Curso(int codigo, String nombre, int creditos) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.creditos = creditos;
    }

    @Override
    public String toString() {
        return "Curso{" + "codigo=" + codigo + ", nombre=" + nombre + ", docente=" + docente + ", creditos=" + creditos + '}';
    }
    
    
    
}

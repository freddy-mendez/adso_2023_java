package com.example.data;

public class Estudiante {
    private long documento;
    private String nombre="Juan";
    private String email;
    private double promedio;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "documento=" + documento + ", nombre=" + nombre + ", email=" + email + ", promedio=" + promedio + '}';
    }

    

    

    
    
    

    
    
    
    
}

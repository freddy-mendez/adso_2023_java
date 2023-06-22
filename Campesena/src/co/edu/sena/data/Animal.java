package co.edu.sena.data;

public class Animal {
    private String codigo;
    private String categoria;
    private String raza;
    private String nombre;

    public Animal(String codigo, String categoria, String raza, String nombre) {
        this.codigo = codigo;
        this.categoria = categoria;
        this.raza = raza;
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
}

package co.edu.sena.data;

public class Usuario {
    private String tipoDocumento;
    private long numeroIdentidad;
    private String nombres;
    private String apellidos;
    private String contrasena;
    private long telefono;
    private int id_rol;
    private Rol rol;

    public Usuario(String tipoDocumento, long numeroIdentidad, String nombres, String apellidos, String contrasena, long telefono, int id_rol) {
        this.tipoDocumento = tipoDocumento;
        this.numeroIdentidad = numeroIdentidad;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.contrasena = contrasena;
        this.telefono = telefono;
        this.id_rol = id_rol;
    }

    public Usuario(String tipoDocumento, long numeroIdentidad, String nombres, String apellidos, String contrasena, long telefono, Rol rol) {
        this.tipoDocumento = tipoDocumento;
        this.numeroIdentidad = numeroIdentidad;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.contrasena = contrasena;
        this.telefono = telefono;
        this.rol = rol;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public long getNumeroIdentidad() {
        return numeroIdentidad;
    }

    public void setNumeroIdentidad(long numeroIdentidad) {
        this.numeroIdentidad = numeroIdentidad;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public int getId_rol() {
        return id_rol;
    }

    public void setId_rol(int id_rol) {
        this.id_rol = id_rol;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }
    
    


    @Override
    public String toString() {
        return "" + nombres + " " + apellidos;
    }
    
    
    
    
}

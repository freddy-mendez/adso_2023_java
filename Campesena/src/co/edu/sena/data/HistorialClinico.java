package co.edu.sena.data;

import java.util.Date;

public class HistorialClinico {
    private int consecutivo;
    private Date fecha;
    private String codigo_animal;
    private String procedimiento;
    private long id_usuario;
    private String observaciones;

    /*
    Constructor utilizado al cerar un nuevo Historial Clinico y al
    recuperar la información de la BD
    */
    public HistorialClinico(int consecutivo, Date fecha, String codigo_animal, String procedimiento, long id_usuario, String observaciones) {
        this.consecutivo = consecutivo;
        this.fecha = fecha;
        this.codigo_animal = codigo_animal;
        this.procedimiento = procedimiento;
        this.id_usuario = id_usuario;
        this.observaciones = observaciones;
    }

    public int getConsecutivo() {
        return consecutivo;
    }

    public void setConsecutivo(int consecutivo) {
        this.consecutivo = consecutivo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getCodigo_animal() {
        return codigo_animal;
    }

    public void setCodigo_animal(String codigo_animal) {
        this.codigo_animal = codigo_animal;
    }

    public String getProcedimiento() {
        return procedimiento;
    }

    public void setProcedimiento(String procedimiento) {
        this.procedimiento = procedimiento;
    }

    public long getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(long id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
    
    
    
}

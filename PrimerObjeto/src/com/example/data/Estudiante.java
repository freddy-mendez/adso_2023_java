
import java.util.Objects;

public class Estudiante {
    public long documento;
    public String nombre="Juan";
    public String email;
    public double promedio;
    
    public String traerNombre() {
        return this.nombre;
    }
    
    public double getPromedio() {
        return this.promedio;
    }
    
    public void cambiarEmail(String nuevoEmail) {
        this.email=nuevoEmail;
    }
    
    public void updateDatos(String nombre, String email) {
        this.nombre=nombre;
        this.email=email;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "documento=" + documento + ", nombre=" + nombre + ", email=" + email + ", promedio=" + promedio + '}';
    }
    
    

    
    
    
    
}

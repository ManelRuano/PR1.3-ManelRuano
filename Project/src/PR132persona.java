import java.io.Serializable;

public class PR132persona implements Serializable {
    private String nombre;
    private String apellido;
    private int edad;

    public PR132persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Apellido: " + apellido + ", Edad: " + edad;
    }
}

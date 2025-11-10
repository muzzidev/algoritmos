package holamundo;

import java.util.Serializable;

public class Tarea implements Serializable() {
    String nombre;
    String descripcion;

    public Tarea(String nombre, String descripcion) {
        nombre = this.nombre;
        descripcion = this.descripcion;
    }

    getNombre() {
        return this.nombre;
    }

    getDescripcion() {
        return this.descripcion;
    }

    @Override
    public String toString() {
        return "Tarea: " + nombre + " | Descripcion: " + descripcion;
    }
}
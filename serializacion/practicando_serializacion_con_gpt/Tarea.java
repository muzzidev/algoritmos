package holamundo;

import java.util.Properties;
import java.io.FileInputStream;
import java.util.Scanner;

public class Tarea {
    String nombre;
    String descripcion;

    public Tarea(String nombre, String descripcion) {
        nombre = this.nombre;
        descripcion = this.descripcion;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getDescripcion() {
        return this.descripcion;
    }
    
    @Override
    public String toString() {
        return "Nombre: " + this.nombre + " | Descripcion: " + this.descripcion;
    }
}

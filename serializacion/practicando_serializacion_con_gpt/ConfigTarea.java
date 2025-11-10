package holamundo;

import java.util.Properties;
import java.io.FileInputStream;
import java.util.Scanner;

public class ConfigTarea {
    private List<Tarea> tareas = new ArrayList<>();
    private final String archivoTareas = "tareas.ser";

    public cargarTareas() {
        try(ObjectInputStram ois = new ObjectInputStram(archivoTareas)) {
            tareas = (List<Tarea>) ois.readObject();
            System.out.println("tareas cargadas");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public mostrarTareas (String nombre) {
        tareas.forEach(System.out::println);
    }

    public agregarTarea(String nombre, String descripcion) {
        Tarea t = new Tarea(nombre, descripcion);
        tareas.add(t);
        System.out.println("tarea agregada correctamente");
    }

    public eliminarTarea (String nombre) {
        tareas.removeIf(t -> t.getNombre().equalsIgnoreCase(nombre));
        System.out.println("tarea eliminada correctamente");
    }



}

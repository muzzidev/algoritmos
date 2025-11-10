package holamundo;

public class GestorDeTarea() {
    private List<Tarea> tareas = new ArrayList<>();
    private final String archivoTareas = "tareas.ser";

    public void cargarTareas() {
        try( ObjectInputStram ois = new ObjectInputStram(archivoTareas) ) {
            tareas = (List<Tarea>) ois.readObject();
            System.out.println("Tareas cargadas correctamente");
        } catch (FileNotFoundException e) {
            System.out.println("No tareas cargadas correctamente");
        } catch (Exception e) {
            System.out.println("Error al cargar tareas");
        }
    }

    public void guardarTareas() {
        try( ObjectOutputStream oos = new ObjectOutputStream(archivoTareas) ) {
            oos.writeObject(tareas);
            System.out.println("tareas guardadas correctamente");
        } catch (Exception e) {
            System.out.println("error al guardar tareas " + e.getMessage());
        }
    }

    public void agregarTarea(Tarea t) {
        tareas.add(t);
        System.out.println("tarea agregada");
    }

    public void eliminarTarea(String nombre) {
        tareas.removeIf(t -> t.getNombre().equalsIgnoreCase(nombre));
        System.out.println("tarea eliminada");
    }

    public void mostrarTareas() {
        if (tareas.isEmpty()) {
            System.out.println("no hay tareas para mostrar");
        } else {
            tareas.forEach(System.out::println)
        }
    }
}

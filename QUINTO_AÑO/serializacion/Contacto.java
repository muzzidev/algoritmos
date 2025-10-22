import java.io.*;
import java.util.*;

class Contacto implements Serializable {
    private String nombre;
    private String telefono;
    public boolean gay;

    public Contacto(String nombre, String telefono, boolean gay) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.gay = gay;
    }

    public String getNombre() { return nombre; }
    public boolean getGay() { return gay; }
    public String getTelefono() { return telefono; }
}

public class Agenda {
    private static final String ARCHIVO = "agenda.ser";
    private List<Contacto> contactos = new ArrayList<>();

    // Cargar agenda al iniciar
    public void cargar() {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(ARCHIVO))) {
            contactos = (List<Contacto>) in.readObject();
            System.out.println("📂 Agenda cargada correctamente.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("⚠ No se encontró una agenda previa, se creará una nueva.");
        }
    }

    // Guardar agenda
    public void guardar() {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(ARCHIVO))) {
            out.writeObject(contactos);
            System.out.println("💾 Agenda guardada correctamente.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Agregar contacto
    public void agregar(String nombre, String telefono) {
        contactos.add(new Contacto(nombre, telefono));
        System.out.println("✅ Contacto agregado: " + nombre);
    }

    // Eliminar contacto
    public void eliminar(String nombre) {
        contactos.removeIf(c -> c.getNombre().equalsIgnoreCase(nombre));
        System.out.println("🗑 Contacto eliminado (si existía): " + nombre);
    }

    // Buscar contacto
    public void buscar(String nombre) {
        for (Contacto c : contactos) {
            if (c.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("🔎 Encontrado → " + c.getNombre() + ": " + c.getTelefono());
                return;
            }
        }
        System.out.println("❌ No se encontró el contacto.");
    }

    public void mostrar() {
        System.out.println("\n📖 Contactos en la agenda:");
        for (Contacto c : contactos) {
            System.out.println("- " + c.getNombre() + " → " + c.getTelefono());
        }
    }

    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        agenda.cargar();

        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- MENU AGENDA ---");
            System.out.println("1. Agregar contacto");
            System.out.println("2. Eliminar contacto");
            System.out.println("3. Buscar contacto");
            System.out.println("4. Mostrar todos");
            System.out.println("5. Guardar y salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Teléfono: ");
                    String tel = sc.nextLine();
                    agenda.agregar(nombre, tel);
                    break;
                case 2:
                    System.out.print("Nombre a eliminar: ");
                    agenda.eliminar(sc.nextLine());
                    break;
                case 3:
                    System.out.print("Nombre a buscar: ");
                    agenda.buscar(sc.nextLine());
                    break;
                case 4:
                    agenda.mostrar();
                    break;
                case 5:
                    agenda.guardar();
                    System.out.println("👋 Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 5);

        sc.close();
    }
}
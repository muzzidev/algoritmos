import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.io.ClassNotFoundException;
import java.util.List;

public class DeserializarListaPersonas {
    public static void main(String[] args) {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("personas.ser"))) {
            List<Persona> personas = (List<Persona>) in.readObject();
            System.out.println("✅ Lista deserializada correctamente:");
            for (Persona p : personas) {
                System.out.println("Nombre: " + p.getNombre() + " | Edad: " + p.getEdad());
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

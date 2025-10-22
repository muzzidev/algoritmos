import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.io.ClassNotFoundException;

public class DeserializarPersona {
    public static void main(String[] args) {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("persona.ser"))) {
            Persona p = (Persona) in.readObject();
            System.out.println("✅ Objeto Persona deserializado correctamente:");
            System.out.println("Nombre: " + p.getNombre());
            System.out.println("Edad: " + p.getEdad());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

// GUARDAR INSTANCIA DE PERSONA EN UN ARCHIVO
public class SerializarPersona {
    public static void main(String[] args) {
        Persona p = new Persona("Joaquín", 18);

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("persona.ser"))) {
            out.writeObject(p);
            System.out.println("Objeto Persona serializado correctamente en persona.ser");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

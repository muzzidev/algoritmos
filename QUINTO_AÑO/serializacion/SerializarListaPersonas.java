import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SerializarListaPersonas {
    public static void main(String[] args) {
        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Ana", 20));
        personas.add(new Persona("Carlos", 25));
        personas.add(new Persona("Lucía", 30));

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("personas.ser"))) {
            out.writeObject(personas);
            System.out.println("✅ Lista de personas serializada en personas.ser");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

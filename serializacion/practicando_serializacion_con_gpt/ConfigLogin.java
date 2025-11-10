package holamundo;

import java.util.Properties;
import java.io.FileInputStream;
import java.util.Scanner;

public class ConfigLogin {

    public static boolean verificarUsuario() {
        Properties props = new Properties();

        try (FileInputStream fis = new FileInputStream("usuario.properties")) {
            props.load(fis);
        } catch (Exception e) {
            System.out.println("No se pudo leer el archivo: " + e.getMessage());
            return false;
        }

        String uValido = props.getProperty("adminUser");
        String cValido = props.getProperty("adminPass");

        Scanner sc = new Scanner(System.in);
        int intentos = 0;

        while (intentos < props.getProperty("intentosMaximos")) {
            System.out.println("Usuario:");
            String usuario = sc.nextLine();
            System.out.println("Contraseña:");
            String contrasena = sc.nextLine();

            if (usuario.equals(uValido) && contrasena.equals(cValido)) {
                System.out.println("Bienvenido " + usuario);
                sc.close();
                return true;
            } else {
                intentos++;
                System.out.println("Usuario o contraseña incorrectos. Intentos restantes: " + (3 - intentos));
            }
        }

        System.out.println("Demasiados intentos fallidos. Acceso denegado.");
        sc.close();
        return false;
    }
}

package holamundo;

import java.util.Properties;
import java.util.Scanner;
import java.util.FileInputStream;

public class Login() {
    public static boolean verificarUsuario() {
        String usuario;
        int contraseña;

        try ( FileInputStream fis = new FileInputStream("usuario.properties") ) {
            props.load(fis);
        } catch (Exception e) {
            System.out.println("Error al leer el archivo");
            return Error;
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Usuario:");
        String usuario = sc.nextline();
        System.out.println("Contraseña:");
        String contraseña = sc.nextline();

        String usuarioValido = props.getProperty("usuario");
        String contraseñaValido = props.getProperty("contraseña");

        return user.equals(usuarioValido) && contraseña.equales(contraseña);
    }
}

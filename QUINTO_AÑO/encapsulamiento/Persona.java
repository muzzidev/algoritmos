public class Direccion {
    private String calle;
    private String ciudad;

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        if(calle != null && !calle.trim().isEmpty()) {
            this.calle = calle;
        } else {
            System.out.println("Error: la calle no puede estar vacía.");
        }
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        if(ciudad != null && !ciudad.trim().isEmpty()) {
            this.ciudad = ciudad;
        } else {
            System.out.println("Error: la ciudad no puede estar vacía.");
        }
    }
}

public class PersonaConDireccion {
    private String nombre;
    private Direccion direccion;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if(nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        } else {
            System.out.println("Error: el nombre no puede estar vacío.");
        }
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        if(direccion != null) {
            this.direccion = direccion;
        } else {
            System.out.println("Error: la dirección no puede ser nula.");
        }
    }
}

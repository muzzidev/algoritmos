public class Pasaporte {
    private String numero;
    private String paisEmision;

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        if(numero != null && !numero.trim().isEmpty()) {
            this.numero = numero;
        } else {
            System.out.println("Error: el número de pasaporte no puede estar vacío.");
        }
    }

    public String getPaisEmision() {
        return paisEmision;
    }

    public void setPaisEmision(String paisEmision) {
        if(paisEmision != null && !paisEmision.trim().isEmpty()) {
            this.paisEmision = paisEmision;
        } else {
            System.out.println("Error: el país de emisión no puede estar vacío.");
        }
    }
}

public class PersonaConPasaporte {
    private String nombre;
    private Pasaporte pasaporte;

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

    public Pasaporte getPasaporte() {
        return pasaporte;
    }

    public void setPasaporte(Pasaporte pasaporte) {
        if(pasaporte != null) {
            this.pasaporte = pasaporte;
        } else {
            System.out.println("Error: el pasaporte no puede ser nulo.");
        }
    }
}

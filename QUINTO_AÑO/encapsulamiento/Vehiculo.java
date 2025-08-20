public class Vehiculo {
    private String patente;
    private int velocidadMaxima;

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        if(patente != null && (patente.length() == 6 || patente.length() == 7)) {
            this.patente = patente;
        } else {
            System.out.println("Error: la patente debe tener 6 o 7 caracteres.");
        }
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        if(velocidadMaxima >= 60 && velocidadMaxima <= 250) {
            this.velocidadMaxima = velocidadMaxima;
        } else {
            System.out.println("Error: la velocidad máxima debe estar entre 60 y 250.");
        }
    }
}

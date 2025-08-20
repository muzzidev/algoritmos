public class Motor {
    private int potenciaHP;
    private String tipo; // nafta, diésel, eléctrico

    public int getPotenciaHP() {
        return potenciaHP;
    }

    public void setPotenciaHP(int potenciaHP) {
        if(potenciaHP > 0) {
            this.potenciaHP = potenciaHP;
        } else {
            System.out.println("Error: la potencia debe ser mayor a 0.");
        }
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        if(tipo != null && (tipo.equalsIgnoreCase("nafta") || 
                            tipo.equalsIgnoreCase("diésel") || 
                            tipo.equalsIgnoreCase("eléctrico"))) {
            this.tipo = tipo;
        } else {
            System.out.println("Error: el tipo de motor debe ser nafta, diésel o eléctrico.");
        }
    }
}

public class Auto {
    private String marca;
    private Motor motor;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        if(marca != null && !marca.trim().isEmpty()) {
            this.marca = marca;
        } else {
            System.out.println("Error: la marca no puede estar vacía.");
        }
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        if(motor != null) {
            this.motor = motor;
        } else {
            System.out.println("Error: el motor no puede ser nulo.");
        }
    }
}

public class Transferencia {
    private double monto;
    private String cbuOrigen;
    private String cbuDestino;

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        if(monto > 0) {
            this.monto = monto;
        } else {
            System.out.println("Error: el monto debe ser mayor a 0.");
        }
    }

    public String getCbuOrigen() {
        return cbuOrigen;
    }

    public void setCbuOrigen(String cbuOrigen) {
        if(cbuOrigen != null && cbuOrigen.length() == 22) {
            this.cbuOrigen = cbuOrigen;
        } else {
            System.out.println("Error: el CBU origen debe tener 22 dígitos.");
        }
    }

    public String getCbuDestino() {
        return cbuDestino;
    }

    public void setCbuDestino(String cbuDestino) {
        if(cbuDestino != null && cbuDestino.length() == 22) {
            if(!cbuDestino.equals(this.cbuOrigen)) {
                this.cbuDestino = cbuDestino;
            } else {
                System.out.println("Error: el CBU destino debe ser distinto al de origen.");
            }
        } else {
            System.out.println("Error: el CBU destino debe tener 22 dígitos.");
        }
    }
}

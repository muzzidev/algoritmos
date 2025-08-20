import java.util.ArrayList;
import java.util.List;

public class CuentaBancaria {
    private String numeroCuenta;
    private double saldo;

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        if(numeroCuenta != null && !numeroCuenta.trim().isEmpty()) {
            this.numeroCuenta = numeroCuenta;
        } else {
            System.out.println("Error: el número de cuenta no puede estar vacío.");
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if(saldo >= 0) {
            this.saldo = saldo;
        } else {
            System.out.println("Error: el saldo no puede ser negativo.");
        }
    }

    public void depositar(double monto) {
        if(monto > 0) {
            saldo += monto;
        } else {
            System.out.println("Error: el depósito debe ser mayor a 0.");
        }
    }

    public void retirar(double monto) {
        if(monto > 0) {
            if(monto <= saldo) {
                saldo -= monto;
            } else {
                System.out.println("Error: fondos insuficientes.");
            }
        } else {
            System.out.println("Error: el retiro debe ser mayor a 0.");
        }
    }
}

public class Cliente {
    private String nombre;
    private List<CuentaBancaria> cuentas = new ArrayList<>();

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

    public void agregarCuenta(CuentaBancaria cuenta) {
        if(cuenta != null) {
            cuentas.add(cuenta);
        } else {
            System.out.println("Error: cuenta nula.");
        }
    }

    public List<CuentaBancaria> getCuentas() {
        return cuentas;
    }
}

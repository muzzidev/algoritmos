public class Main {
    public static void main(String[] args) {
        Persona p = new Persona();
        p.setNombre("Juan");
        p.setEdad(25);

        Producto prod = new Producto();
        prod.setNombre("Celular");
        prod.setPrecio(500);

        Pedido pedido = new Pedido();
        pedido.agregarProducto(prod);
        System.out.println("Total del pedido: " + pedido.calcularPedido());

        CuentaBancaria cta = new CuentaBancaria();
        cta.setNumeroCuenta("12345");
        cta.setSaldo(1000);
        cta.depositar(500);
        cta.retirar(200);
        System.out.println("Saldo final: " + cta.getSaldo());
    }
}

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private List<Producto> productos = new ArrayList<>();

    public void agregarProducto(Producto p) {
        if(p != null) {
            productos.add(p);
        } else {
            System.out.println("Error: producto nulo.");
        }
    }

    public double calcularPedido() {
        double total = 0;
        for(Producto p : productos) {
            total += p.getPrecio();
        }
        return total;
    }
}

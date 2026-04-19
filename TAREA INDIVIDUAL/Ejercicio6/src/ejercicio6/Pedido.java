package ejercicio6;

public class Pedido {
    String cliente;
    String plato;
    double precio;
    int cantidad;
    
    public Pedido(String cliente, String plato, double precio, int cantidad) {
        this.cliente = cliente;
        this.plato = plato;
        this.precio = precio;
        this.cantidad = cantidad;
    }
    
    public double calcularSubtotal() {
        return precio * cantidad;
    }
    
    public double calcularDescuento() {
        double subtotal = calcularSubtotal();
        if (subtotal > 25) {
            return subtotal * 0.1;
        } else {
            return 0;
        }
    }
    
    public double calcularTotal() {
        return calcularSubtotal() - calcularDescuento();
    }
    
    public void mostrar() {
        System.out.println("------------- CUENTA DEL PEDIDO -------------");
        System.out.println("Cliente: " + cliente);
        System.out.println("Plato: " + plato);
        System.out.println("Precio: " + precio);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Subtotal: " + calcularSubtotal());
        System.out.println("Descuento: " + calcularDescuento());
        System.out.println("Total final: " + calcularTotal());
    }
}

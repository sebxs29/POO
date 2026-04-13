package modelo;

public class Producto {

    private double precio;

    public Producto(double precio) {
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    private String nombre = "Lapiz";

    public String getNombre() {
        return nombre;
    }
}

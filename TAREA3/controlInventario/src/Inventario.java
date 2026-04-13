public class Inventario {

    private String nombreProducto;
    private int cantidad;

    public Inventario(String nombreProducto, int cantidad) {
        setNombreProducto(nombreProducto);
        setCantidad(cantidad);
    }

    public void setNombreProducto(String nombreProducto) {
        if (!nombreProducto.isEmpty()) {
            this.nombreProducto = nombreProducto;
        } else {
            System.out.println("Nombre invalido");
        }
    }

    public void setCantidad(int cantidad) {
        if (cantidad >= 0) {
            this.cantidad = cantidad;
        } else {
            System.out.println("Cantidad invalida");
        }
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void mostrar() {
        System.out.println("Producto: " + nombreProducto);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("--------------------------------------");
    }
}

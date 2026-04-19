package ejercicio7;

public class Producto {
    public String codigo;
    public String nombre;
    public String categoria;
    private double precio;
    private int stock;
    private int stockMinimo;
    
    public Producto(String codigo, String nombre, String categoria, double precio, int stock, int stockMinimo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.categoria = categoria;
        
        setPrecio(precio);
        setStock(stock);
        setStockMinimo(stockMinimo);
    }
    
    public void setPrecio(double precio) {
        if (precio > 0) {
            this.precio = precio;
            System.out.println("Precio actualizado correctamente");
        } else {
            System.out.println("Error: precion invalido");
        }
    }
    
    public void setStock(int stock) {
        if (stock >= 0 ) {
            this.stock = stock;
            System.out.println("Stock actualizado correctamente");
        } else {
            System.out.println("Error: stock invalido");
        }
    }
    
    public void setStockMinimo(int stockMinimo) {
        if (stockMinimo >= 0) {
            this.stockMinimo = stockMinimo;
            System.out.println("Stock minimo actualizado correctamente");
        } else {
            System.out.println("Error: stock minimo invalido");
        }
     }
    
    public double calcularValorInventario() {
        return stock * precio;
    }
    
    public String obtenerEstadoStock() {
        if (stock < stockMinimo) {
            return "Requiere reposicion";
        } else if (stock == 0) {
            return "Producto agotado";
        } else {
            return "Stock suficiente";
        }
    }
    
    public void mostrarReporte() {
        System.out.println("--------- REPORTE DE PRODUCTO ---------");
        System.out.println("Codigo: " + codigo);
        System.out.println("Nombre: " + nombre);
        System.out.println("Categoria: " + categoria);
        System.out.println("Precio: " + precio);
        System.out.println("Stock: " + stock);
        System.out.println("Stock minimo: " + stockMinimo);
        System.out.println("Valor inventario: " + calcularValorInventario());
        System.out.println("Estado: " + obtenerEstadoStock());
        System.out.println("--------------------------------------");
    }
}

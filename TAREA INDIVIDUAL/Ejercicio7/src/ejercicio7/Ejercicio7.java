package ejercicio7;

public class Ejercicio7 {

    public static void main(String[] args) {
        Producto p = new Producto("PRD-105", "Disco SSD 1TB", "Almacenamiento", 89.5, 12, 8);
        
        p.mostrarReporte();
        
        System.out.println("\n--- ACTUALIZACION ---");
        p.setPrecio(95.00);
        p.setStock(5);
        
        p.mostrarReporte();
        
        System.out.println("\n--- PRUEBA INVALIDA ---");
        p.setStock(-3);
        
        p.mostrarReporte();
    }
    
}

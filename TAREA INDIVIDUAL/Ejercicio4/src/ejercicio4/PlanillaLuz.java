package ejercicio4;

public class PlanillaLuz {
    String nombre;
    double consumo;
    double costoKw;
    
    public PlanillaLuz(String nombre, double consumo, double costoKw) {
        this.nombre = nombre;
        this.consumo = consumo;
        this.costoKw = costoKw;
    }
    
    public double calcularSubtotal() {
        return consumo * costoKw;
    }
    
    public double calcularIva() {
        return calcularSubtotal() * 0.15;
    }
    
    public double calcularTotal() {
        return calcularIva() + calcularSubtotal();
    }
    
    public void mostrar() {
        System.out.println("----------- PLANILLA DE LUZ -----------");
        System.out.println("Cliente: " + nombre);
        System.out.println("Subtotal: " + calcularSubtotal());
        System.out.println("IVA: " + calcularIva());
        System.out.println("Total a pagar: " + calcularTotal());
    }
}

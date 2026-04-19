package ejercicio5;

public class Empleado {
    String nombre;
    double horasTrabajadas;
    double pagoHora;
    
    
    public Empleado (String nombre, double horasTrabajadas, double pagoHora) {
        this.nombre = nombre;
        this.horasTrabajadas = horasTrabajadas;
        this.pagoHora = pagoHora;
    }
    
    public double calcularSueldoBase() {
        return horasTrabajadas * pagoHora;
    }
    
    public double calcularBono() {
        return calcularSueldoBase() * 0.05;
    }
    
    public double calcularSueldoFinal() {
        return calcularSueldoBase() + calcularBono();
    }
    
    public void mostrar() {
        System.out.println("----------- REPORTE DE EMPLEADO -----------");
        System.out.println("Nombre: " + nombre);
        System.out.println("Sueldo base: " + calcularSueldoBase());
        System.out.println("Bono: " + calcularBono());
        System.out.println("Sueldo final: " + calcularSueldoFinal());
    }
}

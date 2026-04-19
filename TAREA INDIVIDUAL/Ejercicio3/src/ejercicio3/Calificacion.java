package ejercicio3;
public class Calificacion {
    String nombre;
    double nota1;
    double nota2;
    double nota3;
    
    public Calificacion(String nombre, double nota1, double nota2, double nota3) {
        this.nombre = nombre;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }
    
    public double calcularPromedio() {
        return (nota1 + nota2 + nota3) / 3;
    }
    
    public String determinarEstado() {
        double promedio = calcularPromedio();
        if (promedio >= 7) {
            return "Aprobado";
        } else {
            return "Reprobado";
        }
    }
    
    public void mostrarReporte() {
        System.out.println("-------- REPORTE ACADÉMICO --------");
        System.out.println("Nombre: " + nombre);
        System.out.println("Promedio final: " + calcularPromedio());
        System.out.println("Estado: " + determinarEstado());
    }
}

package ejercicio3;
import java.util.Scanner;
public class Ejercicio3 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nombre del estudiante: ");
        String nombre = sc.nextLine();
        
        System.out.print("Nota 1: ");
        double nota1 = sc.nextDouble();
        
        System.out.print("Nota 2: ");
        double nota2 = sc.nextDouble();
        
        System.out.print("Nota 3: ");
        double nota3 = sc.nextDouble();
        
        Calificacion c = new Calificacion(nombre, nota1, nota2, nota3);
        
        c.mostrarReporte();        
    }
    
}

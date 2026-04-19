package ejercicio5;
import java.util.Scanner;
public class Ejercicio5 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        
        System.out.print("Horas trabajadas: ");
        double horasTrabajadas = sc.nextDouble();
        
        System.out.print("Pago por hora: ");
        double pagoHora = sc.nextDouble();
        
        Empleado e = new Empleado(nombre, horasTrabajadas, pagoHora);
        e.mostrar();
    }
    
}

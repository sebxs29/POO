package ejercicio1;
import java.util.Scanner;

public class Estudiante {
    String nombre;
    String carrera;
    int edad;
    
    public void registrarDatos() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese el nombre: ");
        nombre = sc.nextLine();
        
        System.out.print("Ingrese la carrera: ");
        carrera = sc.nextLine();
        
        System.out.print("Ingrese la edad: ");
        edad = sc.nextInt();
    }
    
    public void mostrarDatos() {
        System.out.println("----- DATOS DEL ESTUDIANTE -----");
        System.out.println("Nombre: " + nombre);
        System.out.println("Carrera: " + carrera);
        System.out.println("Edad: " + edad);
    }
    
}

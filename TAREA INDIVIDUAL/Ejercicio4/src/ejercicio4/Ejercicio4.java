package ejercicio4;
import java.util.Scanner;
public class Ejercicio4 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nombre del cliente: ");
        String nombre = sc.nextLine();
        
        System.out.print("Consumo: ");
        double consumo = sc.nextDouble();
        
        System.out.print("Costo por kW: ");
        double costoKw = sc.nextDouble();
        
        PlanillaLuz p = new PlanillaLuz(nombre, consumo, costoKw);
        
        p.mostrar();
    }
    
}

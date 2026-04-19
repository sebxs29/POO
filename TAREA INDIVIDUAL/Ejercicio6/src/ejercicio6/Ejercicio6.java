package ejercicio6;
import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Cliente: ");
        String cliente = sc.nextLine();
        
        System.out.print("Plato: ");
        String plato = sc.nextLine();
        
        System.out.print("Precio: ");
        double precio = sc.nextDouble();
        
        System.out.print("Cantidad: ");
        int cantidad = sc.nextInt();
        
        Pedido p = new Pedido(cliente, plato, precio, cantidad);
        
        p.mostrar();
        
    }
    
}

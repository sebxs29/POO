import java.util.Scanner;
import java.util.InputMismatchException;
void main() {
    Scanner sc = new Scanner(System.in);


    try {
        System.out.print("Nombre del cliente: ");
        String nombre = sc.nextLine();

        System.out.print("Saldo: $");
        double saldo = sc.nextDouble();

        System.out.print("Edad: ");
        int edad = sc.nextInt();

        sc.nextLine();

        Cliente c = new Cliente(nombre, saldo, edad);

        System.out.print("Tipo de pelicula (+18/-18): ");
        String tipo = sc.nextLine();

        System.out.print("Precio: $");
        String precio = sc.nextLine();

        Cine cine = new Cine();
        cine.reservarEntrada(c, tipo, precio);

    } catch (IllegalArgumentException e){
        System.out.println(e.getMessage());
    } catch (InputMismatchException e) {
        System.out.println("Error: tipo de dato incorrecto");
    } catch (AgeInvalidException e) {
        System.out.println(e.getMessage());
    } catch (ArithmeticException e) {
        System.out.println("Error: saldo insuficiente");
    } finally {
        System.out.println("Gracias por usar nuestro sistema");
    }

}

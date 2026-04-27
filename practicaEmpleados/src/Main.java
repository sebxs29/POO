
import java.util.Scanner;

void main() {

    Scanner sc = new Scanner(System.in);

    System.out.print("Ingrese el nombre del empleado: ");
    String nombre = sc.nextLine();

    System.out.print("Ingrese las horas trabajadas: ");
    int horas = sc.nextInt();

    System.out.print("Ingrese le pago por hora: ");
    double pagoHora = sc.nextDouble();

    Empleado e = new EmpleadoPorHoras(nombre, horas, pagoHora);

    e.mostrarDatos();
}

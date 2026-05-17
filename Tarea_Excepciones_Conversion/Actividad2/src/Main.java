import java.util.Scanner;

void main() {

    Scanner sc = new Scanner(System.in);
    // Se piden los 3 estudiantes con un bucle para no repetir codigo y no
    // poner valores quemados
    Estudiante[] estudiantes = new Estudiante[3];
    try {

        for (int i = 0; i < 3; i++) {
            System.out.println("Estudiante " + (i + 1));

            System.out.print("Nombre: ");
            String nombre = sc.nextLine();

            System.out.print("Edad: ");
            int edad = sc.nextInt();

            System.out.print("Promedio: ");
            double promedio = sc.nextDouble();

            sc.nextLine();

            estudiantes[i] = new Estudiante(nombre, edad, promedio);
        }

        for (int i = 0; i < 3; i++) {
            estudiantes[i].mostrarDatos();
        }

    } catch (EdadInvalidaException e) {
        System.out.println(e.getMessage());
    }
}
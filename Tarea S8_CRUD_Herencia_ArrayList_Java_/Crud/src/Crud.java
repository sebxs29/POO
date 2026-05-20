import java.util.ArrayList;
import java.util.Scanner;
public class Crud {

    ArrayList<Persona> listaPersonas = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    // SE UTILIZA BUCLES PARA QUE EL CREATE NO SE CIERRE SI EL USUARIO INGRESA MAL
    // RETURN PARA SALIR SI EL REGISTRO ES EXITOSO
    public void create() {

        while (true) {

            System.out.println("Seleccione tipo: ");
            System.out.println("1. Estudiante");
            System.out.println("2. Docente");

            int opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:
                    try {
                        System.out.print("Ingrese cedula: ");
                        String cedula = sc.nextLine();

                        System.out.print("Ingrese nombre: ");
                        String nombre = sc.nextLine();

                        System.out.print("Ingrese edad: ");
                        int edad = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Ingrese carrera: ");
                        String carrera = sc.nextLine();

                        Estudiante e = new Estudiante(cedula, nombre, edad, carrera);
                        listaPersonas.add(e);

                        System.out.println("Registro agregado correctamente");
                        return;

                    } catch (IllegalArgumentException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case 2:
                    try {
                        System.out.print("Ingrese cedula: ");
                        String cedula = sc.nextLine();

                        System.out.print("Ingrese nombre: ");
                        String nombre = sc.nextLine();

                        System.out.print("Ingrese edad: ");
                        int edad = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Ingrese asignatura: ");
                        String asignatura = sc.nextLine();

                        Docente d = new Docente(cedula, nombre, edad, asignatura);
                        listaPersonas.add(d);

                        System.out.println("Registro agregado correctamente");
                        return;

                    } catch (IllegalArgumentException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                default:
                    System.out.println("Opción inválida. Intente nuevamente...\n");
            }
        }
    }

    public void read() {

        // VERIFICAR QUE EL ARRAYLIST NO ESTE VACIO
        if (listaPersonas.isEmpty()) {
            System.out.println("No hay registros");
            return;
        }

        for (Persona p : listaPersonas) {
            p.mostrarDatos();
            System.out.println("-----------------------");
        }
    }

    public void update() {

        if (listaPersonas.isEmpty()) {
            System.out.println("No hay registros");
            return;
        }

        System.out.print("Ingrese cédula a actualizar: ");
        String cedulaBuscada = sc.nextLine();

        boolean encontrado = false;

        for (Persona p : listaPersonas) {

            if (p.getCedula().equals(cedulaBuscada)) {

                System.out.print("Nuevo nombre: ");
                String nombre = sc.nextLine();

                System.out.print("Nueva edad: ");
                int edad = sc.nextInt();
                sc.nextLine();

                p.setNombreCompleto(nombre);
                p.setEdad(edad);

                if (p instanceof Estudiante) {
                    Estudiante e = (Estudiante) p;

                    System.out.print("Nueva carrera: ");
                    String carrera = sc.nextLine();

                    e.setCarrera(carrera);
                }

                if (p instanceof Docente) {
                    Docente d = (Docente) p;

                    System.out.print("Nueva asignatura: ");
                    String asignatura = sc.nextLine();

                    d.setAsignatura(asignatura);
                }

                System.out.println("Registro actualizado correctamente");
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("No se encontró la cédula");
        }
    }

    public void delete() {

        // VERIFICAR QUE EL ARRAYLIST NO ESTE VACIO
        if (listaPersonas.isEmpty()) {
            System.out.println("No hay registros");
            return;
        }

        System.out.print("Ingrese cédula a eliminar: ");
        String cedulaBuscada = sc.nextLine();

        boolean encontrado = false;

        for (int i = 0; i < listaPersonas.size(); i++) {

            Persona p = listaPersonas.get(i);

            if (p.getCedula().equals(cedulaBuscada)) {

                listaPersonas.remove(i);

                System.out.println("Registro eliminado correctamente");
                encontrado = true;

                break;
            }
        }

        if (!encontrado) {
            System.out.println("No se encontró la cédula");
        }
    }

    public void menu() {

        int opcion = 0;

        do {

            try {

                System.out.println("=== CRUD ===");
                System.out.println("1. Registrar persona");
                System.out.println("2. Mostrar registros");
                System.out.println("3. Actualizar registro");
                System.out.println("4. Eliminar registro");
                System.out.println("5. Salir");

                opcion = Integer.parseInt(sc.nextLine());

                switch (opcion) {

                    case 1:
                        create();
                        break;

                    case 2:
                        read();
                        break;

                    case 3:
                        update();
                        break;

                    case 4:
                        delete();
                        break;

                    case 5:
                        System.out.println("Saliendo...");
                        break;

                    default:
                        System.out.println("Opción inválida");
                }

            } catch (NumberFormatException e) {
                System.out.println("Error: ingrese solo números");
            }

        } while (opcion != 5);
    }
}

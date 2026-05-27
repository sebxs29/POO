package app;

import modelo.*;
import servicio.EmpleadoServicio;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        EmpleadoServicio servicio = new EmpleadoServicio();
        int opcion = 0;

        while (true) {
            try {
                System.out.println("\n===== CLÍNICA SALUD TOTAL =====");
                System.out.println("1. Registrar médico");
                System.out.println("2. Registrar administrativo");
                System.out.println("3. Mostrar empleados");
                System.out.println("4. Buscar por cédula");
                System.out.println("5. Reemplazar información");
                System.out.println("6. Eliminar registro");
                System.out.println("7. Calcular pagos");
                System.out.println("8. Mostrar estadísticas");
                System.out.println("9. Salir");

                opcion = Integer.parseInt(sc.nextLine());

                switch (opcion) {

                    case 1:
                        System.out.println("Registro médico (simplificado demo)");
                        servicio.agregarEmpleado(
                                new Medico("1", "Juan", 30, "099", "a@a.com", "General", 40, 25)
                        );
                        break;

                    case 2:
                        System.out.println("Registro administrativo (demo)");
                        servicio.agregarEmpleado(
                                new Administrativo("2", "Ana", 28, "098", "b@b.com", "RRHH", 160, 4.5)
                        );
                        break;

                    case 3:
                        servicio.mostrarEmpleados();
                        break;

                    case 4:
                        System.out.println("Ingrese cédula:");
                        String ced = sc.nextLine();
                        var emp = servicio.buscarPorCedula(ced);
                        if (emp != null) emp.mostrarInformacion();
                        else System.out.println("No encontrado");
                        break;

                    case 6:
                        System.out.println("Eliminar cédula:");
                        String del = sc.nextLine();
                        if (servicio.eliminar(del))
                            System.out.println("Eliminado");
                        else
                            System.out.println("No existe");
                        break;

                    case 8:
                        servicio.estadisticas();
                        break;

                    case 9:
                        System.exit(0);
                }

            } catch (NumberFormatException e) {
                System.out.println("Error: opción inválida.");
            }
        }
    }
}

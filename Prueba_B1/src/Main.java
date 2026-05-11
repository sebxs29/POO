import java.util.Scanner;
void main() {

    Scanner sc = new Scanner(System.in);

    DronLiviano dron1 = new DronLiviano("LIV001", "LivianoX", 12.5, 2.3, 1.5);

    System.out.println("===== INFORMACION INICIAL DE DRONES =====");
    dron1.mostrarInformacion();

    DronCarga dron2 = new DronCarga("CAR001", "CargaMax", 45, 20, 3);
    dron2.mostrarInformacion();

    DronEmergencia dron3 = new DronEmergencia("EMER001", "RescueFly", 8, 3, 1, 1);
    dron3.mostrarInformacion();

    System.out.println("===== INGRESO DE NUEVOS DATOS ====");
    System.out.println("=== QUE DRON DESEA MODIFICAR ===");
    System.out.println("1. Dron Liviano");
    System.out.println("2. Dron Carga");
    System.out.println("3. Dron Emergencia");

    System.out.print("Seleccione una opcion: ");
    int opcion = sc.nextInt();

    sc.nextLine();

    try {

        switch (opcion) {

            case 1:

                System.out.println();
                System.out.println("=== MODIFICAR DRON LIVIANO ===");

                System.out.print("Codigo: ");
                dron1.setCodigo(sc.nextLine());

                System.out.print("Modelo: ");
                dron1.setModelo(sc.nextLine());

                System.out.print("Distancia Km: ");
                dron1.setDistanciaKm(sc.nextDouble());

                System.out.print("Peso paquete: ");
                dron1.setPesoPaquete(sc.nextDouble());

                System.out.print("Horas vuelo: ");
                dron1.setHorasVuelo(sc.nextDouble());

                System.out.println();
                System.out.println("=== INFORMACION ACTUALIZADA ===");

                dron1.mostrarInformacion();

                break;

            case 2:

                System.out.println();
                System.out.println("=== MODIFICAR DRON CARGA ===");

                System.out.print("Codigo: ");
                dron2.setCodigo(sc.nextLine());

                System.out.print("Modelo: ");
                dron2.setModelo(sc.nextLine());

                System.out.print("Distancia Km: ");
                dron2.setDistanciaKm(sc.nextDouble());

                System.out.print("Peso paquete: ");
                dron2.setPesoPaquete(sc.nextDouble());

                System.out.print("Horas vuelo: ");
                dron2.setHorasVuelo(sc.nextDouble());

                System.out.println();
                System.out.println("=== INFORMACION ACTUALIZADA ===");

                dron2.mostrarInformacion();

                break;

            case 3:

                System.out.println();
                System.out.println("=== MODIFICAR DRON EMERGENCIA ===");

                System.out.print("Codigo: ");
                dron3.setCodigo(sc.nextLine());

                System.out.print("Modelo: ");
                dron3.setModelo(sc.nextLine());

                System.out.print("Distancia Km: ");
                dron3.setDistanciaKm(sc.nextDouble());

                System.out.print("Peso paquete: ");
                dron3.setPesoPaquete(sc.nextDouble());

                System.out.print("Horas vuelo: ");
                dron3.setHorasVuelo(sc.nextDouble());

                System.out.print("Nivel prioridad (1-3): ");
                dron3.setNivelPrioridad(sc.nextInt());

                System.out.println();
                System.out.println("=== INFORMACION ACTUALIZADA ===");

                dron3.mostrarInformacion();

                break;

            default:

                System.out.println("Opcion invalida");
        }

    } catch (IllegalArgumentException e) {

        System.out.println();
        System.out.println("Error: " + e.getMessage());
    }

    sc.close();
}


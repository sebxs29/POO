import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nombre del huésped: ");
        String nombre = sc.nextLine();

        System.out.print("Tipo: ");
        String tipo = sc.nextLine().toLowerCase();

        System.out.print("Noches: ");
        int noches = sc.nextInt();

        System.out.print("Cantidad de personas: ");
        int personas = sc.nextInt();
        sc.nextLine();

        if (tipo.equals("simple")) {

            HabitacionSimple h = new HabitacionSimple();

            h.setHuesped(nombre);
            h.setNumeroNoches(noches);
            h.setCantidadPersonas(personas);

            System.out.print("Desayuno incluido: ");
            boolean desayuno = sc.nextBoolean();

            System.out.print("Costo desayuno: ");
            double costo = sc.nextDouble();
            sc.nextLine();

            h.setDesayunoIncluido(desayuno);
            h.setCostoDesayuno(costo);

            System.out.print("Servicio adicional: ");
            String servicio = sc.nextLine();
            h.agregarServicio(servicio);

            h.generarFactura();
        }

        else if (tipo.equals("suite")) {

            Suite h = new Suite();

            h.setHuesped(nombre);
            h.setNumeroNoches(noches);
            h.setCantidadPersonas(personas);

            System.out.print("Jacuzzi: ");
            boolean jacuzzi = sc.nextBoolean();

            System.out.print("Servicio Premium: ");
            boolean premium = sc.nextBoolean();
            sc.nextLine();

            h.setJacuzzi(jacuzzi);
            h.setServicioPremium(premium);

            System.out.print("Servicio adicional: ");
            String servicio = sc.nextLine();
            h.agregarServicio(servicio);

            h.generarFactura();
        }

        else if (tipo.equals("familiar")) {

            HabitacionFamiliar h = new HabitacionFamiliar();

            h.setHuesped(nombre);
            h.setNumeroNoches(noches);
            h.setCantidadPersonas(personas);

            System.out.print("Capacidad: ");
            int cap = sc.nextInt();

            System.out.print("Descuento familiar: ");
            double desc = sc.nextDouble();
            sc.nextLine();

            h.setCapacidadPersonas(cap);
            h.setDescuentoFamiliar(desc);

            System.out.print("Servicio adicional: ");
            String servicio = sc.nextLine();
            h.agregarServicio(servicio);

            h.generarFactura();
        }

        sc.close();
    }
}
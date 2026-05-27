package servicio;

import modelo.*;
import java.util.ArrayList;

public class EmpleadoServicio {

    private ArrayList<Empleado> empleados = new ArrayList<>();

    public boolean agregarEmpleado(Empleado e) {
        if (buscarPorCedula(e.getCedula()) != null) return false;
        empleados.add(e);
        return true;
    }

    public void mostrarEmpleados() {
        if (empleados.isEmpty()) {
            System.out.println("No hay registros.");
            return;
        }
        for (Empleado e : empleados) {
            System.out.println("---------------");
            e.mostrarInformacion();
        }
    }

    public Empleado buscarPorCedula(String cedula) {
        for (Empleado e : empleados) {
            if (e.getCedula().equals(cedula)) {
                return e;
            }
        }
        return null;
    }

    public boolean actualizar(String cedula, Empleado nuevo) {
        for (int i = 0; i < empleados.size(); i++) {
            if (empleados.get(i).getCedula().equals(cedula)) {
                empleados.set(i, nuevo);
                return true;
            }
        }
        return false;
    }

    public boolean eliminar(String cedula) {
        return empleados.removeIf(e -> e.getCedula().equals(cedula));
    }

    public void estadisticas() {
        int medicos = 0;
        int admin = 0;
        double pagoMedicos = 0;
        double pagoAdmin = 0;
        double mayor = 0;
        Empleado top = null;

        for (Empleado e : empleados) {
            double pago = e.calcularPago();

            if (e instanceof Medico) {
                medicos++;
                pagoMedicos += pago;
            } else if (e instanceof Administrativo) {
                admin++;
                pagoAdmin += pago;
            }

            if (pago > mayor) {
                mayor = pago;
                top = e;
            }
        }

        System.out.println("Total médicos: " + medicos);
        System.out.println("Total administrativos: " + admin);
        System.out.println("Total empleados: " + empleados.size());
        System.out.println("Pago médicos: " + pagoMedicos);
        System.out.println("Pago administrativos: " + pagoAdmin);

        if (top != null) {
            System.out.println("Empleado con mayor ingreso:");
            top.mostrarInformacion();
        }
    }
}
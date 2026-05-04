import java.util.ArrayList;

public abstract class Habitacion {
    private String codigo;
    private String tipoHabitacion;
    private double tarifaBase;
    private int numeroNoches;
    private boolean disponible;
    private String huesped;
    private int cantidadPersonas;
    private ArrayList<String> servicios;

    public Habitacion(String codigo, String tipoHabitacion, double tarifaBase) {
        this.codigo = codigo;
        this.tipoHabitacion = tipoHabitacion;
        setTarifaBase(tarifaBase);
        this.disponible = true;
        servicios = new ArrayList<>();
    }

    public void setNumeroNoches(int numeroNoches) {
        if (numeroNoches > 0) {
            this.numeroNoches = numeroNoches;
        } else {
            this.numeroNoches = 1;
        }
    }

    public void setHuesped(String huesped) {
        if (huesped != null && !huesped.isEmpty()) {
            this.huesped = huesped;
        } else {
            this.huesped = "Sin nombre";
        }
    }

    public void setCantidadPersonas(int cantidadPersonas) {
        if (cantidadPersonas > 0) {
            this.cantidadPersonas = cantidadPersonas;
        } else {
            this.cantidadPersonas = 1;
        }
    }

    public void setTarifaBase(double tarifaBase) {
        if (tarifaBase > 0) {
            this.tarifaBase = tarifaBase;
        } else {
            this.tarifaBase = 1;
        }
    }

    public int getNumeroNoches() { return numeroNoches; }
    public double getTarifaBase() { return tarifaBase; }
    public String getTipoHabitacion() { return tipoHabitacion; }
    public String getHuesped() { return huesped; }

    public void agregarServicio(String servicio) {
        servicios.add(servicio.toLowerCase());
    }

    public double calcularRecargos() {
        double total = 0;

        for (String s : servicios) {
            switch (s) {
                case "room service": total += 10; break;
                case "lavanderia": total += 5; break;
                case "parqueadero": total += 3; break;
                case "premium": total += 20; break;
            }
        }
        return total;
    }

    public double calcularDescuento(double subtotal) {
        if (numeroNoches > 5) {
            return subtotal * 0.10;
        }
        return 0;
    }

    public double calcularIVA(double base) {
        return base * 0.15;
    }

    public abstract double calcularHospedaje();
    public abstract void mostrarDetalle();

    public void generarFactura() {
        double subtotal = calcularHospedaje();
        double descuento = calcularDescuento(subtotal);
        double base = subtotal - descuento;
        double iva = calcularIVA(base);
        double recargos = calcularRecargos();
        double total = base + iva + recargos;

        System.out.println("\n===== FACTURA =====");
        System.out.println("Huésped: " + huesped);
        System.out.println("Tipo: " + tipoHabitacion);
        System.out.println("Noches: " + numeroNoches);
        System.out.println("Subtotal: " + subtotal);
        System.out.println("Descuento: " + descuento);
        System.out.println("IVA: " + iva);
        System.out.println("Recargos: " + recargos);
        System.out.println("TOTAL: " + total);
    }
}
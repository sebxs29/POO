public class HabitacionFamiliar extends Habitacion {
    private int capacidadPersonas;
    private double descuentoFamiliar;

    public HabitacionFamiliar() {
        super("H3", "Familiar", 60);
    }

    public void setCapacidadPersonas(int capacidadPersonas) {
        if (capacidadPersonas > 0) {
            this.capacidadPersonas = capacidadPersonas;
        } else {
            this.capacidadPersonas = 1;
        }
    }

    public void setDescuentoFamiliar(double descuentoFamiliar) {
        if (descuentoFamiliar >= 0 && descuentoFamiliar <= 1) {
            this.descuentoFamiliar = descuentoFamiliar;
        } else {
            this.descuentoFamiliar = 0;
        }
    }

    @Override
    public double calcularHospedaje() {
        double subtotal = getTarifaBase() * getNumeroNoches();
        subtotal -= subtotal * descuentoFamiliar;
        return subtotal;
    }

    @Override
    public void mostrarDetalle() {
        System.out.println("Habitación Familiar");
    }
}
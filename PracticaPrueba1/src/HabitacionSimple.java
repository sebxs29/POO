public class HabitacionSimple extends Habitacion {
    private boolean desayunoIncluido;
    private double costoDesayuno;

    public HabitacionSimple() {
        super("H1", "Simple", 35);
    }

    public void setDesayunoIncluido(boolean desayunoIncluido) {
        this.desayunoIncluido = desayunoIncluido;
    }

    public void setCostoDesayuno(double costoDesayuno) {
        if (costoDesayuno >= 0) {
            this.costoDesayuno = costoDesayuno;
        } else {
            this.costoDesayuno = 0;
        }
    }

    @Override
    public double calcularHospedaje() {
        double subtotal = getTarifaBase() * getNumeroNoches();

        if (desayunoIncluido) {
            subtotal += costoDesayuno;
        }

        return subtotal;
    }

    @Override
    public void mostrarDetalle() {
        System.out.println("Habitación Simple");
    }
}

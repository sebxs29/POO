public class Suite extends Habitacion {
    private boolean jacuzzi;
    private boolean servicioPremium;

    public Suite() {
        super("H2", "Suite", 80);
    }

    public void setJacuzzi(boolean jacuzzi) {
        this.jacuzzi = jacuzzi;
    }

    public void setServicioPremium(boolean servicioPremium) {
        this.servicioPremium = servicioPremium;
    }

    @Override
    public double calcularHospedaje() {
        double subtotal = getTarifaBase() * getNumeroNoches();

        if (jacuzzi) {
            subtotal += 25 * getNumeroNoches();
        }

        if (servicioPremium) {
            subtotal += 50;
        }

        return subtotal;
    }

    @Override
    public void mostrarDetalle() {
        System.out.println("Suite");
    }
}
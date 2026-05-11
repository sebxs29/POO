public class DronCarga extends Dron{
    private double costoPorKG;

    public DronCarga() {
        super();
        costoBase = 6;
        costoPorKG = 1.20;
    }

    public DronCarga(String codigo, String modelo, double distanciaKm, double pesoPaquete, double horasVuelo) {
        super(codigo, modelo, distanciaKm, pesoPaquete, horasVuelo);
        costoBase = 6;
        costoPorKG = 1.20;
    }

    public double getCostoPorKG() {return costoPorKG;}
    public void setCostoPorKG(double costoPorKG) {
        if (costoPorKG <= 0) {
            throw new IllegalArgumentException("El costo por kg debe ser mayor a 0");
        }
        this.costoPorKG = costoPorKG;
    }

    @Override
    public void setPesoPaquete(double pesoPaquete) {
        if (pesoPaquete > 30) {
            throw new IllegalArgumentException("El dron de carga soporta maximo 30kg");
        }
        super.setPesoPaquete(pesoPaquete);
    }

    @Override
    public void setHorasVuelo(double horasVuelo) {
        if (horasVuelo > 5) {
            throw new IllegalArgumentException("El dron de carga soporta maximo 5 horas");
        }
        super.setHorasVuelo(horasVuelo);
    }

    @Override
    public boolean validarDatos() {
        return getPesoPaquete() <= 30 && getHorasVuelo() <= 5;
    }

    @Override
    public double calcularCostoEntrega() {
        return costoBase + (getDistanciaKm() * 0.7) + (getPesoPaquete() * costoPorKG);
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("\n===== DRON DE CARGA =====");
        super.mostrarInformacion();
        System.out.println("Costo por Kg " + costoPorKG);
        System.out.println("Costo entrega: $" + calcularCostoEntrega());
        System.out.println("Datos validos: " + validarDatos());
    }
}

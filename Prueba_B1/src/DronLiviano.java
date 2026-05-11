public class DronLiviano extends Dron{
    private double limiteHoras;

    public DronLiviano() {
        super();
        costoBase = 3;
        limiteHoras = 2;
    }

    public DronLiviano(String codigo, String modelo, double distanciaKm, double pesoPaquete, double horasVuelo) {
        super(codigo, modelo, distanciaKm, pesoPaquete, horasVuelo);
        costoBase = 3;
        limiteHoras = 2;
    }

    public double getLimiteHoras() {return limiteHoras;}

    public void setLimiteHoras(double limiteHoras) {
        if (limiteHoras <= 0) {
            throw new IllegalArgumentException("El limite de horas debe ser mayor a 0");
        }
        this.limiteHoras = limiteHoras;
    }

    @Override
    public void setPesoPaquete(double pesoPaquete) {
        if (pesoPaquete > 5) {
            throw new IllegalArgumentException("El dron liviano soporta maximo 5kg");
        }
        super.setPesoPaquete(pesoPaquete);
    }

    @Override
    public void setHorasVuelo(double horasVuelo) {
        if (horasVuelo > 2) {
            throw new IllegalArgumentException("El dron liviano soporta maximo 2 horas");
        }
        super.setHorasVuelo(horasVuelo);
    }

    @Override
    public boolean validarDatos() {
        return getPesoPaquete() <= 5 && getHorasVuelo() <= 2;
    }

    @Override
    public double calcularCostoEntrega() {
        return costoBase + (getDistanciaKm() * 0.5);
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("\n===== DRON LIVIANO =====");

        super.mostrarInformacion();

        System.out.println("Limite horas: " + limiteHoras);
        System.out.println("Costo entrega: $" + calcularCostoEntrega());
        System.out.println("Datos validos: " + validarDatos());
    }
}

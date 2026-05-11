public class DronEmergencia extends Dron {
    private double recargoUrgencia;
    private int nivelPrioridad;

    public DronEmergencia() {
        super();
        costoBase = 30;
        setNivelPrioridad(1);
    }

    public DronEmergencia(String codigo, String modelo, double distanciaKm, double pesoPaquete, double horasVuelo, int nivelPrioridad) {
        super(codigo, modelo, distanciaKm, pesoPaquete, horasVuelo);
        costoBase = 30;
        setNivelPrioridad(nivelPrioridad);
    }

    public double getRecargoUrgencia() {
        return recargoUrgencia;
    }

    public void setRecargoUrgencia(double recargoUrgencia) {
        if(recargoUrgencia < 0) {
            throw new IllegalArgumentException("El recargo no puede ser negativo");
        }
        this.recargoUrgencia = recargoUrgencia;
    }

    public int getNivelPrioridad() {return nivelPrioridad;}

    public void setNivelPrioridad(int nivelPrioridad) {
        if(nivelPrioridad < 1 || nivelPrioridad > 3) {
            throw new IllegalArgumentException("El nivel de prioridad debe estar entre 1 y 3");
        }
        this.nivelPrioridad = nivelPrioridad;

        if(nivelPrioridad == 1) {recargoUrgencia = 50;}

        if(nivelPrioridad == 2) {recargoUrgencia = 30;}

        if(nivelPrioridad == 3) {recargoUrgencia = 10;}
    }

    @Override
    public void setPesoPaquete(double pesoPaquete) {

        if(pesoPaquete > 10) {
            throw new IllegalArgumentException("El dron de emergencia soporta maximo 10kg");
        }
        super.setPesoPaquete(pesoPaquete);
    }

    @Override
    public void setHorasVuelo(double horasVuelo) {

        if(horasVuelo > 3) {
            throw new IllegalArgumentException("El dron de emergencia soporta maximo 3 horas");
        }

        super.setHorasVuelo(horasVuelo);
    }

    @Override
    public boolean validarDatos() {

        return getPesoPaquete() <= 10 && getHorasVuelo() <= 3 && nivelPrioridad >= 1 && nivelPrioridad <= 3;
    }

    @Override
    public double calcularCostoEntrega() {
        return costoBase + (getDistanciaKm() * 1) + recargoUrgencia;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("\n===== DRON DE EMERGENCIA =====");
        super.mostrarInformacion();
        System.out.println("Nivel prioridad: " + nivelPrioridad);
        System.out.println("Recargo urgencia: $" + recargoUrgencia);
        System.out.println("Costo entrega: $" + calcularCostoEntrega());
    }
}
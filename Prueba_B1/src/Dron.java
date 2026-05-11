public abstract class Dron {
    private String codigo;
    private String modelo;
    private double distanciaKm;
    private double pesoPaquete;
    private double horasVuelo;
    protected double costoBase;
    public Dron() {

    }
    public Dron(String codigo, String modelo, double distanciaKm, double pesoPaquete, double horasVuelo) {
        setCodigo(codigo);
        setModelo(modelo);
        setDistanciaKm(distanciaKm);
        setPesoPaquete(pesoPaquete);
        setHorasVuelo(horasVuelo);
    }

    public String getCodigo() {return codigo;}
    public String getModelo() {return modelo;}
    public double getDistanciaKm() {return distanciaKm;}
    public double getPesoPaquete() {return pesoPaquete;}
    public double getHorasVuelo() {return horasVuelo;}
    public double getCostoBase() {return costoBase;}

    public void setCodigo(String codigo) {
        if (codigo == null || codigo.trim().isEmpty()) {
            throw new IllegalArgumentException("El codigo no puede estar vacio");
        }
        this.codigo = codigo;
    }

    public void setModelo(String modelo) {
        if (modelo == null || modelo.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacio");
        }
        this.modelo = modelo;
    }

    public void setDistanciaKm(double distanciaKm) {
        if (distanciaKm <= 0) {
            throw new IllegalArgumentException("La distancia debe ser mayor a 0");
        }
        this.distanciaKm = distanciaKm;
    }

    public void setPesoPaquete(double pesoPaquete) {
        if (pesoPaquete <= 0) {
            throw new IllegalArgumentException("El peso del paquete debe ser mayor a 0");
        }
        this.pesoPaquete = pesoPaquete;
    }

    public void setHorasVuelo(double horasVuelo) {
        if (horasVuelo <= 0) {
            throw new IllegalArgumentException("Las horas de vuelo debem ser mayores a 0");
        }
        this.horasVuelo = horasVuelo;
    }

    public abstract double calcularCostoEntrega();
    public abstract boolean validarDatos();

    public void mostrarInformacion() {
        System.out.println("Codigo: " + codigo);
        System.out.println("Modelo: " + modelo);
        System.out.println("Distancia (km): " + distanciaKm);
        System.out.println("Peso del paquete: " + pesoPaquete);
        System.out.println("Horas de vuelo: " + horasVuelo);
        System.out.println("Costo base: $" + costoBase);
    }
}

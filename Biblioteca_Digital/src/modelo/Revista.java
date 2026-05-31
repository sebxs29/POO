package modelo;

public class Revista extends Material{
    private int numeroEdicion;
    public Revista(int id, String titulo, String autor, int añoPublicacion, int numeroEdicion) {
        super(id, titulo, autor, añoPublicacion);
        setNumeroEdicion(numeroEdicion);
    }

    public void setNumeroEdicion(int numeroEdicion) {
        if (numeroEdicion < 0) {
            throw new IllegalArgumentException("Numero de edicion invalido");
        }
        this.numeroEdicion = numeroEdicion;
    }

    public String toString() {
        return super.toString() +
                "\nEdicion: " + numeroEdicion;
    }
}

package modelo;

public class AudioLibro extends Material{
    int duracionMinutos;
    public AudioLibro(int id, String titulo, String autor, int añoPublicacion, int duracionMinutos) {
        super(id, titulo, autor, añoPublicacion);
        setDuracionMinutos(duracionMinutos);
    }

    public void setDuracionMinutos(int duracionMinutos) {
        if (duracionMinutos <0 ) {
            throw new IllegalArgumentException("Duracion invalida");
        }
        this.duracionMinutos = duracionMinutos;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nDuracion(minutos): " + duracionMinutos;
    }
}

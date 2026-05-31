package modelo;

public class Libro extends Material {
    private int numeroPaginas;

    public Libro(int id, String titulo, String autor, int añoPublicacion, int numeroPaginas) {
        super(id, titulo, autor, añoPublicacion);
        setNumeroPaginas(numeroPaginas);
    }

    public void setNumeroPaginas(int numeroPaginas) {
        if (numeroPaginas < 0) {
            throw new IllegalArgumentException("Numero de paginas invalido");
        }
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nPaginas: " + numeroPaginas;
    }
}

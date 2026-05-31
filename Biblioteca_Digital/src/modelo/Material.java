package modelo;

public abstract class Material {
    private int id;
    private String titulo;
    private String autor;
    private int añoPublicacion;

    public Material(int id, String titulo, String autor, int añoPublicacion) {
        setId(id);
        setTitulo(titulo);
        setAutor(autor);
        setAñoPublicacion(añoPublicacion);
    }

    public void setId(int id) {
        if (id < 0) {
            throw new IllegalArgumentException("El id debe ser mayor a 0");
        }
        this.id = id;
    }

    public void setTitulo(String titulo) {
        if (titulo == null || titulo.trim().isEmpty()) {
            throw new IllegalArgumentException("El titulo no puede estar vacio");
        }
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        if (autor == null || autor.trim().isEmpty()) {
            throw new IllegalArgumentException("El autor no puede estar vacio");
        }
        this.autor = autor;
    }

    public void setAñoPublicacion(int añoPublicacion) {
        if (añoPublicacion < 0 || añoPublicacion > 2026) {
            throw new IllegalArgumentException("Año de publicacion invalido");
        }
        this.añoPublicacion = añoPublicacion;
    }

    public String toString() {
        return "Id: " + id +
                "\nTitulo: " + titulo +
                "\nAutor: " + autor +
                "\nAño: " + añoPublicacion;
    }

    public int getId() {return id;}
}

public class Docente extends Persona{
    private String asignatura;

    public Docente(String cedula, String nombreCompleto, int edad, String asignatura) {
        super(cedula, nombreCompleto, edad);
        setAsignatura(asignatura);
    }

    public void setAsignatura(String asignatura) {

        if (asignatura == null || asignatura.isBlank()) {
            throw new IllegalArgumentException("La asignatura no puede estar vacia");
        }
        this.asignatura = asignatura;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Asignatura: " + asignatura);
    }
}

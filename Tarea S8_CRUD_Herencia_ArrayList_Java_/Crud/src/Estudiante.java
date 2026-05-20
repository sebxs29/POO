public class Estudiante extends Persona{
    private String carrera;

    public Estudiante(String cedula, String nombreCompleto, int edad, String carrera) {
        super(cedula, nombreCompleto, edad);
        setCarrera(carrera);
    }

    public void setCarrera(String carrera) {
        if (carrera == null || carrera.isBlank()) {
            throw new IllegalArgumentException("La carrera no puede estar vacia");
        }
        this.carrera = carrera;
    }




    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Carrera: " + carrera);
    }
}

public class Estudiante {
    private String nombre;
    private int edad;
    private double promedio;

    // Se avisa que se puede lanzar una excepcion con throws y despues se lanza con throw
    public Estudiante(String nombre, int edad, double promedio) throws EdadInvalidaException {

        if (edad < 0 || edad > 120) {
            throw new EdadInvalidaException(edad);
        }
        this.nombre = nombre;
        this.edad = edad;
        this.promedio = promedio;
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Promedio: " + promedio);
    }
}


abstract class Empleado {
    private String nombre;
    private int horasTrabajadas;

    public Empleado(String nombre, int horasTrabajadas) {
        this.nombre = nombre;
        setHorasTrabajadas(horasTrabajadas);
    }

    public void mostrarDatos() {
        System.out.println("Empleado: " + nombre);
        System.out.println("Horas: " + horasTrabajadas);
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        if (horasTrabajadas > 0) {
            this.horasTrabajadas = horasTrabajadas;
        }
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public abstract double calcularSalario();
}

class EmpleadoPorHoras extends Empleado{
    private double pagoHora;

    public EmpleadoPorHoras(String nombre, int horasTrabajadas, double pagoHora) {
        super(nombre, horasTrabajadas);
        this.pagoHora = pagoHora;
    }

    public double calcularSalario() {
        return pagoHora * getHorasTrabajadas();
    }

    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Salario: $" + calcularSalario());
    }
}

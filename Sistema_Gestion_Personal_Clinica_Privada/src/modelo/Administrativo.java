package modelo;

public class Administrativo extends Empleado{
    private String departamento;
    private int horasTrabajadas;
    private double valorHora;

    @Override
    public double calcularPago() {
        return horasTrabajadas * valorHora;
    }
}

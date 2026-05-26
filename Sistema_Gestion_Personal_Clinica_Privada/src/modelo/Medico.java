package modelo;

public class Medico extends Empleado{
    private String especialidad;
    private int numeroPacientesAtendidos;
    private double valorConsulta;


    @Override
    public double calcularPago() {
        return numeroPacientesAtendidos * valorConsulta;
    }
}

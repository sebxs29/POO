/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication7;

/**
 *
 * @author LENOVO
 */
public class Paciente {

    private String nombreCompleto;
    private String identificacion;
    private String tipoSeguro;
    private int edad;
    private double costoConsulta;
    private int numeroConsultas;
    private int prioridad;

    public Paciente(String nombreCompleto, String identificacion, String tipoSeguro, int edad, double costoConsulta, int numeroConsultas, int prioridad) {
        this.nombreCompleto = nombreCompleto;
        this.identificacion = identificacion;
        setTipoSeguro(tipoSeguro);
        setEdad(edad);
        setCostoConsulta(costoConsulta);
        setNumeroConsultas(numeroConsultas);
        setPrioridad(prioridad);
    }

    public void setTipoSeguro(String tipoSeguro) {
        if (tipoSeguro.equals("Basico") || tipoSeguro.equals("Premium") || tipoSeguro.equals("SinSeguro")) {
            this.tipoSeguro = tipoSeguro;
        }
    }

    public void setEdad(int edad) {
        if (edad > 0) {
            this.edad = edad;
        }
    }

    public void setCostoConsulta(double costoConsulta) {
        if (costoConsulta > 0) {
            this.costoConsulta = costoConsulta;
        }
    }

    public void setNumeroConsultas(int numeroConsultas) {
        if (numeroConsultas >= 0) {
            this.numeroConsultas = numeroConsultas;
        }
    }

    public void setPrioridad(int prioridad) {
        if (prioridad >= 1 && prioridad <= 5) {
            this.prioridad = prioridad;
        }
    }

    public double calcularCostoTotal() {
        return costoConsulta * numeroConsultas;
    }

    public double calcularDescuento() {
        double total = calcularCostoTotal();
        if (tipoSeguro.equals("Basico")) {
            return total * 0.10;
        } else if (tipoSeguro.equals("Premium")) {
            return total * 0.20;
        } else {
            return 0;
        }
    }

    public double calcularTotalPagar() {
        return calcularCostoTotal() - calcularDescuento();
    }

    public String clasificarPrioridad() {
        if (prioridad >= 4) {
            return "Alta prioridad";
        } else if (prioridad >= 2) {
            return "Prioridad media";
        } else {
            return "Prioridad baja";
        }
    }

    public String generarMensaje() {
        String nivel = clasificarPrioridad();
        if (nivel.equals("Alta prioridad")) {
            return "Atención inmediata requerida";
        } else if (nivel.equals("Prioridad media")) {
            return "Seguimiento necesario";
        } else {
            return "Control regular";
        }
    }

    public void mostrarReporte() {
        System.out.println("----- REPORTE DE PACIENTE -----");
        System.out.println("Nombre: " + nombreCompleto);
        System.out.println("ID: " + identificacion);
        System.out.println("Seguro: " + tipoSeguro);
        System.out.println("Edad: " + edad);
        System.out.println("Consultas: " + numeroConsultas);
        System.out.println("Costo total: $" + calcularCostoTotal());
        System.out.println("Descuento: $" + calcularDescuento());
        System.out.println("Total a pagar: $" + calcularTotalPagar());
        System.out.println("Clasificación: " + clasificarPrioridad());
        System.out.println("Mensaje: " + generarMensaje());
    }
}
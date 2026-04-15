/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication6;

/**
 *
 * @author LENOVO
 */
public class Vendedor {

    private String nombre;
    private String area;
    private double montoVendido;
    private double porcentajeComision;
    private double cumplimientoMeta;

    public Vendedor(String nombre, String area, double montoVendido, double porcentajeComision, double cumplimientoMeta) {
        this.nombre = nombre;
        this.area = area;
        this.montoVendido = montoVendido;
        this.porcentajeComision = porcentajeComision;
        this.cumplimientoMeta = cumplimientoMeta;
    }

    public double getMontoVendido() {
        return montoVendido;
    }

    public double getPorcentajeComision() {
        return porcentajeComision;
    }


    public double calcularComision() {
        return montoVendido * (porcentajeComision / 100);
    }

    public double calcularIngresoTotal() {
        return montoVendido + calcularComision();
    }

    public String obtenerEstadoCumplimiento() {
        if (cumplimientoMeta >= 90) {
            return "Excelente";
        } else if (cumplimientoMeta >= 70) {
            return "Aceptable";
        } else {
            return "Bajo";
        }
    }

    public String obtenerMensajeDesempeno() {
        String estado = obtenerEstadoCumplimiento();

        switch (estado) {
            case "Excelente":
                return "Vendedor con desempeño sobresaliente";
            case "Aceptable":
                return "Vendedor con desempeño aceptable";
            default:
                return "Se requiere seguimiento comercial";
        }
    }

    public void mostrarInformacion() {
        System.out.println("----- INFORMACIÓN DEL VENDEDOR -----");
        System.out.println("Nombre: " + nombre);
        System.out.println("Área: " + area);
        System.out.println("Monto vendido: $" + montoVendido);
        System.out.println("Comisión: $" + calcularComision());
        System.out.println("Ingreso total: $" + calcularIngresoTotal());
        System.out.println("Cumplimiento: " + cumplimientoMeta + "%");
        System.out.println("Estado: " + obtenerEstadoCumplimiento());
        System.out.println("Mensaje: " + obtenerMensajeDesempeno());
    }
}

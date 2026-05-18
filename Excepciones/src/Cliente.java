public class Cliente {
    private String nombre;
    private double saldo;
    private int edad;

    public Cliente(String nombre, double saldo, int edad) {
        setNombre(nombre);
        setSaldo(saldo);
        setEdad(edad);
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.isBlank()) {
            throw new IllegalArgumentException("El nombre del cliente no puede estar vacio");
        }
        this.nombre = nombre;
    }

    public void setSaldo(double saldo) {
        if (saldo <= 0) {
            throw new IllegalArgumentException("El saldo debe ser mayor a 0");
        }
        this.saldo = saldo;
    }

    public void setEdad(int edad) {
        if (edad < 0) {
            throw new IllegalArgumentException("La edad debe ser mayor a 0");
        }
        this.edad = edad;
    }

    public void mostrarDatos() {
        System.out.println("=== CLIENTE ===");
        System.out.println("Nombre: " + nombre);
        System.out.println("Saldo: $" + saldo);
        System.out.println("Edad: " + edad);
    }

    public int getEdad() { return edad;}
    public double getSaldo() {return saldo;}
    public String getNombre() { return nombre;}
}

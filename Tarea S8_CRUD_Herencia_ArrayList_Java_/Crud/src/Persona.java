public class Persona {
    private String cedula;
    private String nombreCompleto;
    private int edad;

    public Persona(String cedula, String nombreCompleto, int edad) {
        setCedula(cedula);
        setNombreCompleto(nombreCompleto);
        setEdad(edad);
    }

    public void setCedula(String cedula) {

        // Valida que la cedula no sea null ni este vacia
        if (cedula == null || cedula.isBlank()) {
            throw new IllegalArgumentException("La cedula no puede estar vacia");
        }

        // Lanza una excepcion si el usuario ingresa letras
        try {
            Integer.parseInt(cedula);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("La cedula solo debe contener numeros");
        }

        // Valida que la cedula sea exactamente 10 digitos
        if (cedula.length() != 10) {
            throw new IllegalArgumentException("La cedula debe tener 10 digitos");
        }
        this.cedula = cedula;
    }

    public void setNombreCompleto(String nombreCompleto) {
        if (nombreCompleto == null || nombreCompleto.isBlank()) {
            throw new IllegalArgumentException("El nombre no puede estar vacio");
        }
        this.nombreCompleto = nombreCompleto;
    }

    public void setEdad(int edad) {

        if (edad < 18 || edad > 70) {
            throw  new IllegalArgumentException("Edad invalida");
        }
        this.edad = edad;
    }

    public void mostrarDatos() {
        System.out.println("Cedula: " + cedula);
        System.out.println("Nombre completo: " + nombreCompleto);
        System.out.println("Edad: " + edad);
    }

    public String getCedula() {return cedula;}
}

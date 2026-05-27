package util;

public class Validador {

    public static boolean correoValido(String correo) {
        return correo.contains("@") && correo.contains(".");
    }

    public static boolean telefonoValido(String telefono) {
        return telefono.matches("\\d+");
    }

    public static boolean textoValido(String t) {
        return t != null && !t.trim().isEmpty();
    }

    public static boolean edadValida(int edad) {
        return edad > 0 && edad < 120;
    }

    public static boolean positivo(double n) {
        return n > 0;
    }
}
public class AgeInvalidException extends Exception{

    public AgeInvalidException() {
        super("Edad invalida");
    }

    public AgeInvalidException(String mensaje) {
        super(mensaje);
    }
}

package excepciones;

public class MaterialNoEncontradoException extends Exception{

    public MaterialNoEncontradoException() {
        super();
    }

    public MaterialNoEncontradoException(String mensaje) {
        super(mensaje);
    }
}

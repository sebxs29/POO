public class EdadInvalidaException extends Exception{
    private int edadIngresada;

    // El constructor devuelve un mensaje con la edad en caso de que se cumpla la excepcion
    public EdadInvalidaException(int edadIngresada) {
        super("Error: edad invalida -> " + edadIngresada);
        this.edadIngresada = edadIngresada;
    }

}

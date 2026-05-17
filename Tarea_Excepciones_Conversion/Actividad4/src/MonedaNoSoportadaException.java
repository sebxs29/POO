public class MonedaNoSoportadaException extends Exception{
    private String moneda;

    public MonedaNoSoportadaException(String moneda) {
        super("La moneda " + moneda + " no esta soportada");
        this.moneda = moneda;
    }
}

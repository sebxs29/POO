public class ConversorMonedas {

    // Se valida el origen y el destino
    public double convertir(String monedaOrigen, String monedaDestino, double cantidad) throws MonedaNoSoportadaException {
        if (!monedaOrigen.equals("USD") && !monedaOrigen.equals("EUR")) {
            throw new MonedaNoSoportadaException(monedaOrigen);
        }

        if (!monedaDestino.equals("USD") && !monedaDestino.equals("EUR")) {
            throw  new MonedaNoSoportadaException(monedaDestino);
        }

        // USD -> EUR
        if (monedaOrigen.equals("USD") && monedaDestino.equals("EUR")) {
            return cantidad * 0.86;
        }

        // EUR -> USD
        if (monedaOrigen.equals("EUR") && monedaDestino.equals("USD")) {
            return cantidad * 1.16;
        }

        // MISMA MONEDA
        if (monedaOrigen.equals(monedaDestino)) {
            return cantidad;
        }
        return cantidad;
    }
}

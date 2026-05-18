public class Cine {

        public void reservarEntrada(Cliente cliente, String tipoPelicula, String precioTexto) throws AgeInvalidException {

            double precio = Double.parseDouble(precioTexto);

            if (tipoPelicula.equals("+18") && cliente.getEdad() < 18) {
                throw new AgeInvalidException("Error: no tienes la edad para ver esta pelicula");
            }

            if (cliente.getSaldo() < precio) {
                throw new ArithmeticException("Error: no tienes saldo suficiente");
            }

            System.out.println("=== RESERVA EXITOSA ===");
            System.out.println("Nombre: " + cliente.getNombre());
            System.out.println("Tipo de pelicula: "  + tipoPelicula);
            System.out.println("Precio: $" + String.format("%.2f", precio));
        }
}

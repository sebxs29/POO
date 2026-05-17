import java.util.Scanner;
void main() {
    Scanner sc = new Scanner(System.in);

    ConversorMonedas conversor = new ConversorMonedas();

    try {
        System.out.print("Moneda origen (USD/EUR): ");
        String origen = sc.nextLine();

        System.out.print("Moneda destino (USD/EUR): ");
        String destino = sc.nextLine();

        System.out.print("Cantidad: ");
        String cantidadTxt = sc.nextLine();

        double cantidad = Double.parseDouble(cantidadTxt);

        double resultado = conversor.convertir(origen, destino, cantidad);

        System.out.println("Resultado: " + String.format("%.2f", resultado) + " " + destino);

    } catch (NumberFormatException e) {
        System.out.println("Error: " + e.getMessage());
    } catch (MonedaNoSoportadaException e) {
        System.out.println("Error: " + e.getMessage());
    }
}

import java.util.Scanner;
void main() {
    Scanner sc = new Scanner(System.in);

    try {
        System.out.print("Ingrese un numero entero: ");

        // Para la exepcion NumberFormatInt hay que usar string
        // ya que este verifica que el texto ingresado sean numeros
        // para poder convertirlos a int,

        String numero = sc.nextLine();
        int numeroInt = Integer.parseInt(numero);

        int resultado = 100 / numeroInt;

        System.out.println("Resultado: " + resultado);
    } catch (ArithmeticException e) {
        System.out.println("No se puede dividir por cero");
    } catch (NumberFormatException e) {
        System.out.println("Debe ingresar un numero valido");
    } finally {
        System.out.println("Programa finalizado correctamente");
    }
}

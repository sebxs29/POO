package modelo;

public class CuentaBancaria {
    private double saldo;

    public void setSaldo(double saldo) {
        if (saldo > 0) {
            this.saldo = saldo;
        } else {
            System.out.println("Error: no se permite saldo negativo");
        }
    }

    public double getSaldo() {
        return saldo;
    }
}

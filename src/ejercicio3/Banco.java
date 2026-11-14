package ejercicio3;

public class Banco {

    // =====================================================
    // VERSIÓN INCORRECTA (Mala práctica)
    // =====================================================
    // El taller pide mostrar por qué NO se debe usar protected
    // en datos sensibles como el saldo.

    /*
    protected double saldo;   // ← MALA PRÁCTICA

    public Banco(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    // Problema:
    // Cualquier subclase o clase del mismo paquete podría hacer:
    // banco.saldo = -500000;
    // banco.saldo = 999999999;
    // Sin ningún tipo de control ni validación.
    // Esto rompe el encapsulamiento y es peligroso.
    */

    // =====================================================
    // VERSIÓN CORRECTA (Buena práctica)
    // =====================================================
    // Se declara como private y se controla el acceso
    // mediante métodos públicos con validaciones.

    private double saldo;

    public Banco(double saldoInicial) {
        if (saldoInicial >= 0) {
            this.saldo = saldoInicial;
        } else {
            this.saldo = 0;
            System.out.println("Saldo inicial inválido. Se estableció en 0.");
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
            System.out.println("Depósito exitoso. Nuevo saldo: $" + saldo);
        } else {
            System.out.println("Error: el monto a depositar debe ser positivo.");
        }
    }

    public boolean retirar(double monto) {
        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
            System.out.println("Retiro exitoso. Nuevo saldo: $" + saldo);
            return true;
        } else {
            System.out.println("Error: no se puede retirar esa cantidad.");
            return false;
        }
    }

    // Método de prueba
    public static void main(String[] args) {
        System.out.println("=== EJERCICIO 3: Banco ===\n");
        System.out.println("Se muestra la versión CORRECTA (con private):\n");

        Banco miBanco = new Banco(1000000);
        System.out.println("Saldo inicial: $" + miBanco.getSaldo());

        miBanco.depositar(250000);
        miBanco.retirar(100000);
        miBanco.retirar(2000000); // Debe fallar por falta de fondos
    }
}
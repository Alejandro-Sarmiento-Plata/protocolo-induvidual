package ejercicio2;

public class Main2 {
    public static void main(String[] args) {
        System.out.println("=== EJERCICIO 2: Coche ===\n");

        Coche c1 = new Coche("Toyota", "Corolla", 180);
        c1.mostrarInfo();

        c1.acelerar(20);   // correcto
        c1.acelerar(-10);  // debe fallar la validación

        c1.mostrarInfo();

        // Intento de acceso directo (da error de compilación)
        // c1.velocidadMaxima = 300;
    }
}
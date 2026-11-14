package ejercicio2;

import ejercicio2.vehiculos.Moto;

public class MainEjercicio2 {
    public static void main(String[] args) {
        System.out.println("=== EJERCICIO 2: Vehiculo y Moto ===\n");

        Moto miMoto = new Moto("Motocicleta", "Yamaha", 250);
        miMoto.mostrarInfoCompleta();

        System.out.println("\n----------------------------------");
        System.out.println("Funcionó porque Moto hereda de Vehiculo y puede acceder a los miembros protected.");

        // Descomenta para ver el error de compilación:
        // Vehiculo v = new Vehiculo("Auto", "Toyota");
        // System.out.println(v.marca);
        // v.mostrarDetalles();
    }
}
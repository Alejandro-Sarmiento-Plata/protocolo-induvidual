public class MainTaller4 {
    public static void main(String[] args) {
        System.out.println("=== EJERCICIO 1: Estudiante ===");
        Estudiante e1 = new Estudiante("Alejandro", 20, 4.5);
        e1.mostrarInfo();

        e1.setEdad(21);
        e1.setNotaPromedio(4.8);
        e1.mostrarInfo();

        // Intento de acceso directo (esto da error de compilación si lo descomentas)
        // e1.nombre = "Hack";   // Error: nombre tiene acceso private

        System.out.println("\n=== EJERCICIO 2: Coche ===");
        Coche c1 = new Coche("Toyota", "Corolla", 180);
        c1.mostrarInfo();
        c1.acelerar(20);
        c1.acelerar(-10); // debe fallar la validación
        c1.mostrarInfo();
    }
}
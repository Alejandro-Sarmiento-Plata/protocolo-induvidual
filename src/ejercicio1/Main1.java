package ejercicio1;

public class Main1 {
    public static void main(String[] args) {
        System.out.println("=== EJERCICIO 1: Estudiante ===\n");

        Estudiante e1 = new Estudiante("Alejandro", 20, 4.5);
        e1.mostrarInfo();

        e1.setEdad(21);
        e1.setNotaPromedio(4.8);
        e1.mostrarInfo();

        // Intento de acceso directo (da error de compilación si se descomenta)
        // e1.nombre = "Hack";
    }
}
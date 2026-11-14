package ejercicio1;

public class MainEjercicio1 {
    public static void main(String[] args) {
        System.out.println("=== EJERCICIO 1: Empleado y Gerente ===\n");

        Gerente g = new Gerente("Carlos Pérez", 4500000, "Desarrollo");
        g.mostrarTodo();
    }
}
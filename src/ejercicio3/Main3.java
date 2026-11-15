package ejercicio3;

public class Main3 {
    public static void main(String[] args) {
        System.out.println("=== EJERCICIO 3: Uso incorrecto de private ===\n");

        // ---------- PARTE 1 ----------
        Persona p = new Persona("Alejandro");

        // Esta línea da ERROR de compilación:
        // System.out.println(p.nombre);

        System.out.println("Parte 1: Si intento acceder a 'p.nombre' el compilador marca error.");
        System.out.println("Eso demuestra que private sí protege el atributo.\n");

        // ---------- PARTE 2 ----------
        Producto prod = new Producto(150000);

        // Tampoco se puede hacer esto:
        // System.out.println(prod.precio);
        // prod.precio = 200000;

        System.out.println("Parte 2: El atributo precio es private y no tiene get/set.");
        System.out.println("Por lo tanto no se puede ni leer ni modificar desde fuera.");
        System.out.println("Esto también es una mala práctica, porque el dato queda inutilizable.");
    }
}
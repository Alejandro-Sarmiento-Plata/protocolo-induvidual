public class PruebaPersona {
    public static void main(String[] args) {
        Persona p = new Persona("Alejandro", 21);

        // Esto SÍ se puede (edad es default)
        System.out.println("Edad (default): " + p.edad);

        // Esto NO se puede (nombre es private)
        // System.out.println(p.nombre); // Error de compilación

        // Forma correcta de acceder al nombre
        System.out.println("Nombre (private): " + p.getNombre());

        p.setNombre("Alejandro Sarmiento");
        System.out.println("Nombre actualizado: " + p.getNombre());
    }
}
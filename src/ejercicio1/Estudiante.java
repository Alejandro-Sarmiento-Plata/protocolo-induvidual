package ejercicio1;

public class Estudiante {
    private String nombre;
    private int edad;
    private double notaPromedio;

    public Estudiante(String nombre, int edad, double notaPromedio) {
        this.nombre = nombre;
        setEdad(edad);
        setNotaPromedio(notaPromedio);
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getNotaPromedio() {
        return notaPromedio;
    }

    // Setters con validaciones
    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        } else {
            System.out.println("Error: el nombre no puede estar vacío");
        }
    }

    public void setEdad(int edad) {
        if (edad >= 0 && edad <= 120) {
            this.edad = edad;
        } else {
            System.out.println("Error: edad inválida");
        }
    }

    public void setNotaPromedio(double notaPromedio) {
        if (notaPromedio >= 0.0 && notaPromedio <= 5.0) {
            this.notaPromedio = notaPromedio;
        } else {
            System.out.println("Error: la nota debe estar entre 0.0 y 5.0");
        }
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre +
                " | Edad: " + edad +
                " | Nota promedio: " + notaPromedio);
    }
}
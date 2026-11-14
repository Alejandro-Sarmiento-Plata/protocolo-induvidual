class Persona {
    private String nombre;   // solo esta clase
    int edad;                // default → visible en el mismo paquete

    Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
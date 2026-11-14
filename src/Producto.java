// Sin declaración de package = paquete por defecto
class Producto {
    String nombre;      // default
    double precio;      // default
    int stock;          // default

    Producto(String nombre, double precio, int stock) { // constructor default
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    void mostrarInfo() { // metodo default
        System.out.println("Producto: " + nombre +
                " | Precio: $" + precio +
                " | Stock: " + stock);
    }
}
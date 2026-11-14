public class PruebaProducto {
    public static void main(String[] args) {
        Producto p = new Producto("Laptop", 2500000, 15);
        p.mostrarInfo();

        // Acceso directo permitido porque estamos en el mismo paquete
        p.precio = 2300000;
        p.stock = 12;
        p.mostrarInfo();
    }
}
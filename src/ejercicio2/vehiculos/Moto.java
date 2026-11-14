package ejercicio2.vehiculos;

public class Moto extends Vehiculo {
    private int cilindrada;

    public Moto(String tipo, String marca, int cilindrada) {
        super(tipo, marca);
        this.cilindrada = cilindrada;
    }

    public void mostrarInfoCompleta() {
        mostrarDetalles();
        System.out.println("Cilindrada: " + cilindrada + " cc");
        System.out.println("Acceso directo desde Moto → Marca: " + marca);
    }
}
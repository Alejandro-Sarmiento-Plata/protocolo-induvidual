package vehiculos;

class Moto extends Vehiculo {
    int cilindrada;

    Moto(String tipo, int cilindrada) {
        super(tipo);
        this.cilindrada = cilindrada;
    }

    void mostrarInfo() {
        mostrarTipo();
        System.out.println("Cilindrada: " + cilindrada + " cc");
    }
}
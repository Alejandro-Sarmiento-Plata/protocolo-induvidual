package vehiculos;

class Vehiculo {                // clase default
    String tipo;                // atributo default

    Vehiculo(String tipo) {
        this.tipo = tipo;
    }

    void mostrarTipo() {
        System.out.println("Tipo de vehículo: " + tipo);
    }
}
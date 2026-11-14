package prueba;

// import vehiculos.Vehiculo;   // Esto da error porque Vehiculo es default
// import vehiculos.Moto;

public class MainTaller5 {
    public static void main(String[] args) {
        // Las siguientes líneas dan error de compilación
        // porque las clases son de acceso default (no visibles fuera del paquete)

        // Vehiculo v = new Vehiculo("Deportivo");
        // Moto m = new Moto("Motocicleta", 250);

        System.out.println("Error esperado: las clases Vehiculo y Moto no son visibles fuera del paquete vehiculos");
    }
}

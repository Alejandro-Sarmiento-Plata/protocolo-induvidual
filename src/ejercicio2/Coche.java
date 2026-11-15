package ejercicio2;

public class Coche {
    private String marca;
    private String modelo;
    private double velocidadMaxima;

    public Coche(String marca, String modelo, double velocidadMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void acelerar(double incremento) {
        if (incremento > 0) {
            velocidadMaxima += incremento;
            System.out.println("Velocidad máxima actualizada a: " + velocidadMaxima + " km/h");
        } else {
            System.out.println("Error: el incremento debe ser positivo");
        }
    }

    public void mostrarInfo() {
        System.out.println("Marca: " + marca +
                " | Modelo: " + modelo +
                " | Vel. Máx: " + velocidadMaxima + " km/h");
    }
}
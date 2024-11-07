package FigurasRegulares;

public class Cuadrado {
    // Atributos
    private double lado;

    // Constructor vacío
    public Cuadrado() {
        this.lado = 0.0;
    }

    // Constructor con parámetro
    public Cuadrado(double lado) {
        this.lado = lado;
    }

    // Getter y Setter
    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    // Métodos para calcular área y perímetro
    public double calcularArea() {
        return lado * lado;
    }

    public double calcularPerimetro() {
        return 4 * lado;
    }
}

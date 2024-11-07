package FigurasRegulares;

public class Triangulo {
    private double lado;

    public Triangulo() {
        this.lado = 0.0;
    }

    public Triangulo(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double calcularArea() {
        return (Math.sqrt(3) / 4) * lado * lado;
    }

    public double calcularPerimetro() {
        return 3 * lado;
    }
}

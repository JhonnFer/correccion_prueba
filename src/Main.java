//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import FigurasRegulares.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear objetos y pedir datos al usuario
        System.out.print("Ingrese el lado del cuadrado: ");
        Cuadrado cuadrado = new Cuadrado(scanner.nextDouble());

        System.out.print("Ingrese el ancho y alto del rectángulo: ");
        Rectangulo rectangulo = new Rectangulo(scanner.nextDouble(), scanner.nextDouble());

        System.out.print("Ingrese el radio del círculo: ");
        Circulo circulo = new Circulo(scanner.nextDouble());

        System.out.print("Ingrese el lado del triángulo: ");
        Triangulo triangulo = new Triangulo(scanner.nextDouble());

        // Imprimir los valores y cálculos de cada figura
        System.out.println("Cuadrado - Área: " + cuadrado.calcularArea() + ", Perímetro: " + cuadrado.calcularPerimetro());
        System.out.println("Rectángulo - Área: " + rectangulo.calcularArea() + ", Perímetro: " + rectangulo.calcularPerimetro());
        System.out.println("Círculo - Área: " + circulo.calcularArea() + ", Perímetro: " + circulo.calcularPerimetro());
        System.out.println("Triángulo - Área: " + triangulo.calcularArea() + ", Perímetro: " + triangulo.calcularPerimetro());

        // Calcular la sumatoria de áreas
        double areaTotal = cuadrado.calcularArea() + rectangulo.calcularArea() + circulo.calcularArea() + triangulo.calcularArea();
        System.out.println("Sumatoria de áreas de las figuras: " + areaTotal);

        scanner.close();
    }
}

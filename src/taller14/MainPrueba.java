package taller14;

public class MainPrueba {
    public static void main(String[] args) {
        Figura circulo = new Circulo(3.0);
        Figura rectangulo = new Rectangulo(4.0, 2.0);

        circulo.calcularArea();
        rectangulo.calcularArea();
    }
}

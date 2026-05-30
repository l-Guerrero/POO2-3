package taller13;

public class MainPrueba {
        public static void main(String[] args) {

            Figura rectangulo = new Rectangulo(3.0, 4.0);
            Figura triangulo = new Triangulo(2.0, 3.0);

            System.out.println("Área del Rectángulo: " + rectangulo.calcularArea());
            System.out.println("Área del Triángulo: " + triangulo.calcularArea());
        }
    }


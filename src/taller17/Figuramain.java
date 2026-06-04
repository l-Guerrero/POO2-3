package taller17;

public class Figuramain {

        public static void imprimirAreaDeFigura(Figura figura) {
            // Se puede sustituir Figura por cualquier subclase sin romper el programa
            System.out.println("El área de la figura es: " + figura.calcularArea());
        }

        public static void main(String[] args) {
            Figura circulo = new Circulo(4.0);
            Figura rectangulo = new Rectangulo(3.0, 5.0);

            System.out.println(" Probando Sustitución de Liskov ");
            imprimirAreaDeFigura(circulo);
            imprimirAreaDeFigura(rectangulo);
        }
    }


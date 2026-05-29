package taller11;

   public abstract class Vehiculo {
        /* Al dejarlo como método concreto las clases hijas heredan este comportamiento
        por defecto y el compilador no las obliga a sobrescribirlo. Esto es un error de diseño porque cada
         vehículo debería acelerar a su propia manera (una moto no acelera igual que un camión).*/
        public void acelerar() {
            System.out.println("El vehículo acelera de forma normal.");
        }
    }

    class Moto extends Vehiculo {
        // No se sobrescribe el método acelerar
    }
         class Main {
        public static void main(String[] args) {

            /* Al quitar las barras de comentario de la línea de abajo  da error inmediatamente porque
             Java prohíbe crear objetos de clases abstractas. */

            // Vehiculo v = new Vehiculo();

            //
            Moto moto = new Moto();
            moto.acelerar(); // Imprime el método normal porque el diseño no obligó a su implementación.
        }
    }


package taller18;

    public class Motocicleta implements Vehiculo {

        @Override
        public void conducir() {
            System.out.println("La motocicleta está en marcha");
        }

        @Override
        public void CargarMercancia() {
            System.out.println("Vehículo no apto para cargar mercancías.");
        }
    }


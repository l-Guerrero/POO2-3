package taller18;

public class MainVehiculo {
        public static void main(String[] args) {
            Motocicleta moto = new Motocicleta();
            Camion camion = new Camion();

            System.out.println("Acciones de la Motocicleta");
            moto.conducir();
            moto.CargarMercancia();

            System.out.println("Acciones del Camión");
            camion.cargarMercancia();
            camion.conducir();
        }
    }


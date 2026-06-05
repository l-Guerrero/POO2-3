package taller18;

    public class Camion implements Conducible, Cargable {
        @Override
        public void conducir() {
            System.out.println("Conduciendo el camión de carga");
        }

        @Override
        public void cargarMercancia() {
            System.out.println("Cargando las mercancías pesadas en el remolque del camión");
        }
    }


package taller17;

public class pruebaMain {
        public static void main(String[] args) {

            Transporte transporteCoche = new Coche();
            Transporte transporteBici = new Bicicleta();

            System.out.println("Sistema de Transporte Verificación LSP");
            iniciarRuta(transporteCoche);
            iniciarRuta(transporteBici);
        }

        public static void iniciarRuta(Transporte medioDeTransporte) {
            System.out.print("Iniciando ruta: ");
            medioDeTransporte.moverse();
        }
    }


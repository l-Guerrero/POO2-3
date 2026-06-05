package taller18;

public class mainprueba {
        public static void main(String[] args) {
            CajeroAutomatico cajero = new CajeroAutomatico();
            PuntoDePago puntoPago = new PuntoDePago();
            AppBancaria app = new AppBancaria();

            System.out.println("Cajero Automático");
            cajero.retirar(100000);

            System.out.println("Punto de Pago");
            puntoPago.pagarFacturas("Servicio de gas");

            System.out.println("App Bancaria");
            app.transferir(70000);
            app.pagarFacturas("Energía");
            app.retirar(10000);
        }
    }


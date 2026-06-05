package taller18;

    public class CajeroBase implements OperacionBancaria {

        @Override
        public void retirar(double monto) {
            System.out.println("Retirando $" + monto + " del cajero");
        }

        @Override
        public void transferir(double monto) {
            // El cajero no hace transferencias, pero está forzado a implementar el metodo
            System.out.println("Operación no soportada.");
        }

        @Override
        public void pagarFactura(String servicio) {
            // no paga facturas
            System.out.println("Operación no soportada.");
        }
    }


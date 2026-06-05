package taller18;

    public class AppBancaria implements Transferible, Retirable, PagadorFacturas {
        @Override
        public void transferir(double monto) {
            System.out.println("Transferencia exitosa por $" + monto + " a la cuenta destino.");
        }

        @Override
        public void retirar(double monto) {
            System.out.println("Código generado para retiro sin tarjeta por $" + monto + ".");
        }

        @Override
        public void pagarFacturas(String servicio) {
            System.out.println("Factura de " + servicio + " pagada desde el saldo de la cuenta");
        }
    }


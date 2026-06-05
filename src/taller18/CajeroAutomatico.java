package taller18;

    public class CajeroAutomatico implements Retirable {
        @Override
        public void retirar(double monto) {
            System.out.println("Dispensando $" + monto + " en efectivo.");
        }
    }


package taller18;

    public class CuentaAhorros extends CuentaBancaria {
        private double tasaInteres;

        public CuentaAhorros(double saldoInicial, double tasaInteres) {
            super(saldoInicial);
            this.tasaInteres = tasaInteres;
        }

        public void aplicarInteres() {
            this.saldo += this.saldo * tasaInteres;
        }

        // No sobrescribimos retirar para restringirlo,
        // por lo que se mantiene el comportamiento de la clase base y se cumple LSP.
    }


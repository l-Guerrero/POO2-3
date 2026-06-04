package taller18;

public class CuentaBancaria {
        protected double saldo;

        public CuentaBancaria(double saldoInicial) {
            this.saldo = saldoInicial;
        }

        public void depositar(double monto) {
            if (monto > 0) {
                this.saldo += monto;
            }
        }

        public void retirar(double monto) {
            if (monto <= this.saldo) {
                this.saldo -= monto;
            } else {
                System.out.println("Fondos insuficientes.");
            }
        }

        public double getSaldo() {
            return saldo;
        }
    }


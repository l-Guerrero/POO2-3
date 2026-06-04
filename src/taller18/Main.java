package taller18;

public class Main {
        public static void main(String[] args) {
            CuentaBancaria cuentaNormal = new CuentaBancaria(2000.0);
            CuentaBancaria miCuentaAhorro = new CuentaAhorros(1000.0, 0.06);
            System.out.println("Prueba de Sustitución de Liskov");

            realizarOperacion(cuentaNormal, 200.0);
            realizarOperacion(miCuentaAhorro, 200.0);


            System.out.println("Saldo Cuenta Normal: " + cuentaNormal.getSaldo());
            System.out.println("Saldo Cuenta Ahorros: " + miCuentaAhorro.getSaldo());
        }

        // a el LSP no le importa el tipo específico de cuenta,
        // solo le importa que cumpla el contrato de CuentaBancaria.
        public static void realizarOperacion(CuentaBancaria cuenta, double monto) {
            System.out.println("Retirando " + monto);
            cuenta.retirar(monto);
            System.out.println("Saldo tras retiro: " + cuenta.getSaldo());
        }
    }


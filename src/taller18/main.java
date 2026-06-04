package taller18;

public class main {
        public static void main(String[] args) {
            Mecanico mecanico = new Mecanico();
            PersonalAseo personalAseo = new PersonalAseo();
            TrabajadorIntegral trabajadorIntegral = new TrabajadorIntegral();


            System.out.println("Acciones del Mecánico");
            mecanico.reparar();

            System.out.println(" Acciones del Personal de Aseo ");
            personalAseo.limpiar();

            System.out.println("Acciones del Trabajador Integral");
            trabajadorIntegral.reparar();
            trabajadorIntegral.limpiar();
        }
    }


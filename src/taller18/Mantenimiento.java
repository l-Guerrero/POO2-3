package taller18;

    //  viola el ISP al agrupar múltiples responsabilidades
    public interface Mantenimiento {
        void reparar();
        void limpiar();
    }

    // Un técnico que solo repara es forzado a implementar limpiar
       class TecnicoReparacion implements Mantenimiento {
        @Override
        public void reparar() {
            System.out.println("El técnico está realizando el mantenimiento y las reparaciones");
        }

        @Override
        public void limpiar() {
            // Implementación vacía o innecesaria, ya que al técnico no le corresponde
            System.out.println("El técnico no realiza tareas de limpieza.");
        }
    }


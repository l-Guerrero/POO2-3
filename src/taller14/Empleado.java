package taller14;

class Empleado {
    public void trabajar() {
        System.out.println("El empleado está trabajando");
    }
}

class Gerente extends Empleado {
    public void asignarPresupuesto() {
        System.out.println("El gerente está asignando presupuesto");
    }
}

    class Main {
    public static void main(String[] args) {
        Empleado empleado = new Gerente();

        empleado.trabajar();

          //El siguiente método causa un error de compilacion al descomentarse
         // empleado.asignarPresupuesto();

         /*La variable empleado es de tipo Empleado
         El compilador solo reconoce los métodos definidos en la clase Empleado.
          Aunque el objeto en memoria es un Gerente, la referencia no tiene
          permiso para acceder a asignarPresupuesto porque no existe en la clase base.
         */
    }
}
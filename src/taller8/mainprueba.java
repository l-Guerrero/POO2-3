package taller8;

public class mainprueba {
    public static void main(String[] args) {
        Coche coche = new Coche("Mazda", 150, 4);
        coche.mostrarInformacion();
    }
}
class claseprueba {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("Jose Perez", 26, "YT-2006-07");
        estudiante.mostrarDetalles();
    }
}
class Mainprueba {
    public static void main(String[] args) {
        Empleado empleado = new Empleado ( "Fernanda Torres", 250000);
        empleado.mostrarDetalles();

        Gerente gerente = new Gerente("Luis Lopez", 100000, "Sistemas");
        gerente.mostrarDetalles();
    }
}

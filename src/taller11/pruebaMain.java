package taller11;

public class pruebaMain {
    public static void main(String[] args) {

        Empleado empleado1 = new Gerente("Jair Mendoza", 23000, 10000);

        Empleado empleado2 = new Vendedor("Ana Martinez", 10000, 20, 0.010);

        System.out.println("Detalles");
        empleado1.mostrarDetalles();
        empleado2.mostrarDetalles();



    }
}

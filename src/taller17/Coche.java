package taller17;

public class Coche extends Transporte {
    @Override
    public void moverse() {
        System.out.println("El coche avanza usando su motor");
    }

    // exclusivo del coche
    public void encenderRadio() {
        System.out.println("Radio del coche encendido");
    }
}

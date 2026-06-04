package taller18;

public class Mecanico implements Reparable {
    @Override
    public void reparar() {
        System.out.println("El mecánico está realizando las reparaciones del equipo");
    }
}

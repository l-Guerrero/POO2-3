package taller18;

public class TrabajadorIntegral implements Reparable, Limpiable {
    @Override
    public void reparar() {
        System.out.println("El trabajador integral realiza reparaciones básicas");
    }

    @Override
    public void limpiar() {
        System.out.println("El trabajador integral también se encarga de la limpieza de su área");
    }
}

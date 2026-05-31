package taller16;

public class MensajeroEmail implements  Mensajero{
    @Override
    public void enviar (String mensaje){
        System.out.println("Enviando correo electrónico: " + mensaje);
    }
}

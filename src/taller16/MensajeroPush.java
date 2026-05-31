package taller16;

public class MensajeroPush implements Mensajero{
    @Override
    public void enviar (String mensaje){
        System.out.println("Enviando notificación push: " + mensaje);
    }
}

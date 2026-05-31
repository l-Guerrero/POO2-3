package taller16;

public class MensajeroSMS implements Mensajero{
    @Override
    public void enviar (String mensaje){
        System.out.println("Enviando SMS: "+ mensaje);
    }
}

package taller16;

public class mainPrueba {
    public static void main(String[] args) {
        String aviso = "Tu paquete está en camino";

        Mensajero email = new MensajeroEmail();
        Mensajero sms = new MensajeroSMS();
        Mensajero push = new MensajeroPush();

        email.enviar(aviso);
        sms.enviar(aviso);
        push.enviar(aviso);
    }
}

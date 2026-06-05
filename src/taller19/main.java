package taller19;

public class main {
    public static void main(String[] args) {

        ServicioAutenticacion authLocal = new AutenticacionLocal();
        GestorAutenticacion gestorLocal = new GestorAutenticacion(authLocal);
        gestorLocal.iniciarSesion("estudiante_01", "nombre123");

        ServicioAutenticacion authOAuth = new AutenticacionOAuth();
        GestorAutenticacion gestorOAuth = new GestorAutenticacion(authOAuth);
        gestorOAuth.iniciarSesion("estudiante_01", "alumno-01-tri");
    }
}

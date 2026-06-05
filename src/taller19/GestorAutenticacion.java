package taller19;

public class GestorAutenticacion {
    private ServicioAutenticacion servicioAutenticacion;


    public GestorAutenticacion(ServicioAutenticacion servicioAutenticacion) {
        this.servicioAutenticacion = servicioAutenticacion;
    }

    public void iniciarSesion(String nombreUsuario, String credencial) {
        boolean exito = servicioAutenticacion.autenticar(nombreUsuario, credencial);
        if (exito) {
            System.out.println("Acceso concedido");
        } else {
            System.out.println("Acceso denegado");
        }
    }
}

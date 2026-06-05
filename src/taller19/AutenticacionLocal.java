package taller19;

public class AutenticacionLocal implements ServicioAutenticacion {
    @Override
    public boolean autenticar(String nombreUsuario, String contrasena) {
        System.out.println("Iniciando autenticación local para el usuario: " + nombreUsuario);

        if (nombreUsuario == null) {
            return false;
        }

        if (contrasena == null) {
            return false;
        }

        return true;
    }
}

     class AutenticacionOAuth implements ServicioAutenticacion {
    @Override
    public boolean autenticar(String nombreUsuario, String token) {
        System.out.println("Iniciando autenticación OAuth para: " + nombreUsuario);

        if (nombreUsuario == null) {
            return false;
        }

        if (token == null) {
            return false;
        }

        if (token.length() <= 5) {
            return false;
        }

        return true;
    }
}
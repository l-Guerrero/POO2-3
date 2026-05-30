package taller15;

public class Usuario {
        private String nombre;
        private String contrasena;

        public Usuario(String nombre, String contrasena) {
            this.nombre = nombre;
            this.contrasena = contrasena;
        }

        public String getNombre() {
            return nombre;
        }

        public String getContrasena() {
            return contrasena;
        }

        // validación
        public void validarDatos() {
            System.out.println("Validando los datos del usuario");
        }

        //  autenticación
        public void autenticarUsuario() {
            System.out.println("Iniciando sesión para el usuario: " + nombre);
        }
    }


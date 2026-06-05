package taller19;

public class GestorArchivos {
    private Almacenamiento almacenamiento;

    public GestorArchivos(Almacenamiento almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public void procesarArchivo(String nombreArchivo, String contenido) {
        almacenamiento.guardar(nombreArchivo, contenido);
    }

    public String leerArchivo(String nombreArchivo) {
        return almacenamiento.recuperar(nombreArchivo);
    }
}

package taller19;

public class AlmacenamientoLocal implements Almacenamiento {
    @Override
    public void guardar(String nombreArchivo, String contenido) {
        System.out.println("Guardando archivo en el disco local: " + nombreArchivo);
    }

    @Override
    public String recuperar(String nombreArchivo) {
        System.out.println("Recuperando archivo del disco local: " + nombreArchivo);
        return "Contenido simulado del archivo local";
    }
}

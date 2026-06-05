package taller19;

public class AlmacenamientoNube implements Almacenamiento {
    @Override
    public void guardar(String nombreArchivo, String contenido) {
        System.out.println("Subiendo archivo a la nube: " + nombreArchivo);
    }

    @Override
    public String recuperar(String nombreArchivo) {
        System.out.println("Descargando archivo de la nube: " + nombreArchivo);
        return "Contenido simulado del archivo en la nube";
    }
}

package taller16;

public class DocumentoPDF implements Documento{
    @Override
    public void exportar(String contenido){
        System.out.println("Generando archivo PDF: " + contenido);
    }
}

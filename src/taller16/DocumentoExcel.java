package taller16;

public class DocumentoExcel implements Documento{
    @Override
    public void exportar (String contenido){
        System.out.println("Generando archivo Excel: " + contenido);
    }
}
